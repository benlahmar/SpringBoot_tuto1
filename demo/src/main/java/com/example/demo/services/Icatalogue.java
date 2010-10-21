/**
 * 
 */
package com.example.demo.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.models.Categorie;
import com.example.demo.models.dtos.ProduitDTO;

/**
 * @author BENLAHMAR EL Habib 
 *
 */
public interface Icatalogue {

	public Page<Categorie> getCatagories();
	public Categorie getcategorie(Long idcategorie);
	public Page<ProduitDTO> ProduitFromCatgorie(Long idCategorie, Pageable page);
	
	
}
