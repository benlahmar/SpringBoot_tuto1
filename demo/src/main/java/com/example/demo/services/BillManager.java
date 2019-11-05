/**
 * 
 */
package com.example.demo.services;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Client;
import com.example.demo.models.Command;
import com.example.demo.models.Composant;
import com.example.demo.models.Produit;
import com.example.demo.repos.IClient;
import com.example.demo.repos.ICommandRepo;
import com.example.demo.repos.IComposantRepo;
import com.example.demo.repos.ProduitRepo;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Service
public class BillManager implements IBill{

	@Autowired
	IComposantRepo comprepo;
	
	@Autowired
	ICommandRepo comdrepo;
	
	@Autowired
	IClient crepo;
	
	@Autowired
	ProduitRepo prepo;
	
	
	@Override
	public Command addcommand(Command cmd,Long idclient) {
		Optional<Client> o = crepo.findById(idclient);
		Client c=null;
		if(o.isPresent())
			c=o.get();
		cmd.setClient(c);
		cmd=comdrepo.save(cmd);
		return cmd;
	}

	@Override
	public Command addComposant(Composant cp,Long idcommand) {
		Optional<Command> oc = comdrepo.findById(idcommand);
		if(oc.isPresent())
			{
				Command c= oc.get();
				c.getComposants().add(cp);
				comdrepo.save(c);
				return c;
				
			}
		return null;
	}

	@Override
	public Set<Composant> composant4command(Long idcommand) {
		Optional<Command> oc = comdrepo.findById(idcommand);
		if(oc.isPresent())
			return oc.get().getComposants();
		return null;
	}

	@Override
	public Command findCommandById(Long idcommand) {
		Optional<Command> oc = comdrepo.findById(idcommand);
		if(oc.isPresent())
			return oc.get();
		return null;
	}

	@Override
	public List<Command> commandes4Client(Long idclient) {
		return comdrepo.findByClientIdclient(idclient);
		 
	}

	@Override
	public List<Command> findByDateBetween(Date dd, Date df) {
		return comdrepo.findByDateBetween(dd, df);
	}

	@Override
	public List<Command> findByDateBetween(Date dd, Date df, Long idclient) {
		List<Command> res = comdrepo.findByDateBetween(dd, df).stream()
		.filter(x->x.getClient().getIdclient().equals(idclient))
		.collect(Collectors.toList());
		return res;
	}

	@Override
	public List<Command> getcommandplus(double ht) {
		return comdrepo.getcommandplus(ht);
		 
	}

	@Override
	public Command addComposant(Long idprd, double prix, int quantite, Long idcommand) {
		
		Optional<Command> oc = comdrepo.findById(idcommand);
		if(oc.isPresent())
			{
				Command c= oc.get();
				Composant cp=new Composant(quantite, prix);
				Produit p = prepo.findById(idprd).get();
				cp.setProduit(p);
				
				c.getComposants().add(cp);
				
				cp.setCommand(c);
				
				
				comdrepo.save(c);
				return c;
				
			}
		return null;
	}

}
