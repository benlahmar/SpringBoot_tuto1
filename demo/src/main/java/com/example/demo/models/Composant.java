/**
 * 
 */
package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * @author BENLAHMAR EL Habib
 *
 */
@Entity

public class Composant {

	/**
	 * @param quantite
	 * @param prix
	 * 
	 */
	public Composant(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}
	/**
	 * 
	 */
	public Composant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	Long idcomd;
	

	
	@ManyToOne
	Produit produit;
	
	@ManyToOne
	Command command;
	
	int quantite;
	double prix;
	/**
	 * @return the idcomd
	 */
	public Long getIdcomd() {
		return idcomd;
	}
	/**
	 * @param idcomd the idcomd to set
	 */
	public void setIdcomd(Long idcomd) {
		this.idcomd = idcomd;
	}
	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}
	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	/**
	 * @return the command
	 */
	public Command getCommand() {
		return command;
	}
	/**
	 * @param command the command to set
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}
	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
