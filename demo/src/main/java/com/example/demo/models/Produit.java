/**
 * 
 */
package com.example.demo.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author ISGA
 *
 */
@Entity

public class Produit {

	@Id
	@GeneratedValue
	Long idproduit;
	String designation;
	String description;
	double prix;
	int quantite;
	String image;
	Date date_fabrique;
	Date date_expiration;
	
	@Override
	public String toString() {
		return "Produit [idproduit=" + idproduit + ", designation=" + designation + ", description=" + description
				+ ", prix=" + prix + ", quantite=" + quantite + ", image=" + image + ", date_fabrique=" + date_fabrique
				+ ", date_expiration=" + date_expiration + ", categorie=" + categorie + "]";
	}


	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	Categorie categorie;


	/**
	 * @return the idproduit
	 */
	public Long getIdproduit() {
		return idproduit;
	}


	/**
	 * @param idproduit the idproduit to set
	 */
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}


	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}


	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}


	/**
	 * @return the date_fabrique
	 */
	public Date getDate_fabrique() {
		return date_fabrique;
	}


	/**
	 * @param date_fabrique the date_fabrique to set
	 */
	public void setDate_fabrique(Date date_fabrique) {
		this.date_fabrique = date_fabrique;
	}


	/**
	 * @return the date_expiration
	 */
	public Date getDate_expiration() {
		return date_expiration;
	}


	/**
	 * @param date_expiration the date_expiration to set
	 */
	public void setDate_expiration(Date date_expiration) {
		this.date_expiration = date_expiration;
	}


	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}


	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
