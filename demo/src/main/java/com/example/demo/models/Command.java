/**
 * 
 */
package com.example.demo.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Entity
public class Command {

	@Id
	@GeneratedValue
	Long idcommande;
	
	@DateTimeFormat
	@CreatedDate
	Date date;
	
	
	@ManyToOne
	Client client;
	
	@OneToMany(mappedBy = "command", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	Set<Composant> composants=new HashSet<>();
	/**
	 * @return the idcommande
	 */
	public Long getIdcommande() {
		return idcommande;
	}
	/**
	 * @param idcommande the idcommande to set
	 */
	public void setIdcommande(Long idcommande) {
		this.idcommande = idcommande;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the composants
	 */
	public Set<Composant> getComposants() {
		return composants;
	}
	/**
	 * @param composants the composants to set
	 */
	public void setComposants(Set<Composant> composants) {
		this.composants = composants;
	}
	
	
	public double getht()
	{
		//return composants.stream().mapToDouble(x->x.getPrix()*x.getQuantite()).sum();
		double ht=0;
		for (Composant c : composants) {
			ht+=c.getPrix()*c.getQuantite();
		}
		return ht;
		
	}
	
	/**
	 * pour payer la commande
	 * @return
	 */
	public boolean paye()
	{
		
		return false;
		
		
	}
	
	
}
