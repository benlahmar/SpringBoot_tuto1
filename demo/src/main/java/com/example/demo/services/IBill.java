/**
 * 
 */
package com.example.demo.services;


import java.util.Date;
import java.util.List;
import java.util.Set;



import com.example.demo.models.Command;
import com.example.demo.models.Composant;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface IBill {

	public Command addcommand(Command cmd,Long idclient);
	public Command addComposant(Composant cp,Long idcommand);
	public Command addComposant(Long idprd,double prix,int quantite, Long idcommand);
	
	Set<Composant> composant4command(Long idcommand);
	public Command findCommandById(Long idcommande);
	public List<Command> commandes4Client(Long idclient);
	
	public List<Command> findByDateBetween(Date dd,Date df);
	public List<Command> findByDateBetween(Date dd,Date df,Long idclient);
	
	public List<Command> getcommandplus(double ht);
	
	
	
	
}
