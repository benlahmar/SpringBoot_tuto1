/**
 * 
 */
package com.example.demo.services;

import java.util.Set;

import org.springframework.data.domain.Page;

import com.example.demo.models.Categorie;
import com.example.demo.models.Produit;
import com.example.demo.models.dtos.IProduitDTO;
import com.example.demo.models.dtos.ProduitDTO;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface IShowCategorie {
	 Page<Categorie> categories(int nb);
	 Categorie getCategorie(Long idcat);
	 Page<ProduitDTO> produits4Categorie(Long idcate, int nb);
	 Produit getdetaille(Long idproduit);
	 public Page<IProduitDTO> search(String key,int nb);
	 
	 public Categorie addCategorie(Categorie c);
	 public Produit addproduit2Categorie(Produit p, Long idcategorie);
	 public Produit updateproduit(Long idproduit ,Produit pt);
	 
	 
}
