/**
 * 
 */
package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.models.Client;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repos.IClient;
import com.example.demo.repos.RoleRepository;
import com.example.demo.repos.UserRepository;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Service
public class CustomerManager implements Icustomur{

	@Autowired
	IClient cm;
	@Autowired
	UserRepository urepo;
	@Autowired
	RoleRepository rrepo;
	
	
	@Override
	public User inscrire(User c) {

		
		c=urepo.save(c);
		return c;
	}

	@Override
	public User addRole2User(Long idu, Role r) {
		User u = urepo.findById(idu).get();
		u.getRoles().add(r);
		urepo.save(u);
		return u;
	}

	@Override
	public User Authentificat(String log, String pass) {
		User u = urepo.findByUsernameAndPassword(log, pass);
		return u;
	}

	@Override
	public Client getClient4User(Long idUser) {
		Client c = urepo.findById(idUser).get().getClient();
		return c;
	}

	@Override
	public List<Role> getroles(Long idclient) {
		Client c = cm.findById(idclient).get();
		
		return c.getCompte().getRoles();
	}

	@Override
	public Page<Client> clients(int page) {
		
		PageRequest pageable = PageRequest.of(page,3);
		return  cm.findAll(pageable);
	}

	@Override
	public User EditCompte(Long idclient, User compte) {
		Client c = cm.findById(idclient).get();
		c.setCompte(compte);
		cm.save(c);
		return compte;
	}

	@Override
	public User myCompte(Long idclient) {
		Client c = cm.findById(idclient).get();
		return c.getCompte();
		
	}
	public List<User> allcomptes(Long idc)
	{
		return urepo.findByClientIdclient(idc);
	}

	public boolean delete(Long id)
	{
		 Optional<Client> c = cm.findById(id);
		 if(c.isPresent())
		 {
		cm.delete(c.get());
		return true;
		 }else
		 {
			 return false;
			 
		 }
	}
}
