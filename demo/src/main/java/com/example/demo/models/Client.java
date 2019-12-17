/**
 * 
 */
package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Entity
public class Client {

	@Id
	@GeneratedValue
	Long idclient;
	
	String nom,prenom;
	
	@JsonManagedReference
	@OneToOne
	User compte;

	/**
	 * @return the idclient
	 */
	public Long getIdclient() {
		return idclient;
	}

	/**
	 * @param idclient the idclient to set
	 */
	public void setIdclient(Long idclient) {
		this.idclient = idclient;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 */
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [idclient=" + idclient + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	/**
	 * @return the compte
	 */
	public User getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(User compte) {
		this.compte = compte;
	}
	
	
}
