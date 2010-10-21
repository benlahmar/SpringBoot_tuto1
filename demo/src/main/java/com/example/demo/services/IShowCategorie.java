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
 * @author ISGA
 *
 */
public interface IShowCategorie {
	 Page<Categorie> categories(int nb);
	 Categorie getCategorie(Long idcat);
	 Set<ProduitDTO> produits4Categorie(Long idcate);
	 Produit getdetaille(Long idproduit);
	 public Set<IProduitDTO> search(String key);
	 
	 public Categorie addCategorie(Categorie c);
	 public Produit addproduit2Categorie(Produit p, Long idcategorie);
	 public Produit updateproduit(Long idproduit ,Produit pt);
	 
	 
}
