/**
 * 
 */
package com.example.demo.services;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.models.Categorie;
import com.example.demo.models.Produit;
import com.example.demo.models.dtos.IProduitDTO;
import com.example.demo.models.dtos.ProduitDTO;
import com.example.demo.repos.CategorieRepo;
import com.example.demo.repos.ProduitRepo;

/**
 * @author ISGA
 *
 */
@Service
public class ShowCategorie implements IShowCategorie{

	@Autowired
	CategorieRepo crepo;
	@Autowired
	ProduitRepo prepo;

	
	@Override
	public Categorie getCategorie(Long idcat) {
		Optional<Categorie> c = crepo.findById(idcat);
		Categorie r;
		if(c.isPresent())
			r=c.get();
		else
			r=null;
		return r;
	}

	@Override
	public Set<ProduitDTO> produits4Categorie(Long idcate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getdetaille(Long idproduit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<IProduitDTO> search(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit addproduit2Categorie(Produit p, Long idcategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updateproduit(Long idproduit, Produit pt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Categorie> categories(int nb) {
		// TODO Auto-generated method stub
		return null;
	}

}
