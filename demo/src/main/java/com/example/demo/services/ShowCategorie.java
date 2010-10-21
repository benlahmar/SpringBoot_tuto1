/**
 * 
 */
package com.example.demo.services;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.models.Categorie;
import com.example.demo.models.Produit;
import com.example.demo.models.dtos.IProduitDTO;
import com.example.demo.models.dtos.ProduitDTO;
import com.example.demo.repos.CategorieRepo;
import com.example.demo.repos.ProduitRepo;

/**
 * @author BENLAHMAR EL Habib
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
	public Page<ProduitDTO> produits4Categorie(Long idcate, int nb) {
		Set<ProduitDTO> rp = prepo.findByCategorieIdcategorie(idcate,ProduitDTO.class);
		Page<ProduitDTO> pp = (Page<ProduitDTO>) rp;
		
		return pp;
	}

	@Override
	public Produit getdetaille(Long idproduit) {
		Optional<Produit> p = prepo.findById(idproduit);
		Produit pt = null;
		if(p.isPresent())
			pt=p.get();
		
		return pt;
	}

	@Override
	public Page<IProduitDTO> search(String key, int nb) {
		PageRequest pg = PageRequest.of(0, nb);
		Page<IProduitDTO> ps = prepo.findByDesignationContaining(key, IProduitDTO.class,pg);
		return ps;
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		c=crepo.save(c);
		return c;
	}

	@Override
	public Produit addproduit2Categorie(Produit p, Long idcategorie) {
		Categorie c = getCategorie(idcategorie);
		p.setCategorie(c);
		p=prepo.save(p);
		return p;
	}

	@Override
	public Produit updateproduit(Long idproduit, Produit pt) {
		Produit p = prepo.findById(idproduit).get();
		p=pt;
		p=prepo.save(p);
		return p;
	}

	@Override
	public Page<Categorie> categories(int nb) {
		PageRequest pg = PageRequest.of(0, nb);
		Page<Categorie> cs = crepo.findAll(pg);
		return cs;
	}

}
