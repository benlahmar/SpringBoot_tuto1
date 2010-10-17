/**
 * 
 */
package com.example.demo.models;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.SortNatural;

import com.example.demo.utils.ProduitComparateurByPrix;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Entity
public class Categorie {

	@Id
	@GeneratedValue
	Long idcategorie;
	String libelle;
	String description;
	String image;
	
	
	@OneToMany(mappedBy = "categorie")
	@SortNatural
	SortedSet<Produit> produits=new TreeSet<>(new ProduitComparateurByPrix());


	/**
	 * @return the idcategorie
	 */
	public Long getIdcategorie() {
		return idcategorie;
	}


	/**
	 * @param idcategorie the idcategorie to set
	 */
	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}


	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
	 * @return the produits
	 */
	public SortedSet<Produit> getProduits() {
		return produits;
	}


	/**
	 * @param produits the produits to set
	 */
	public void setProduits(SortedSet<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
