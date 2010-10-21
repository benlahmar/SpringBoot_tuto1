package com.example.demo.repos;


import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.Categorie;


public interface CategorieRepo extends PagingAndSortingRepository<Categorie, Long>{
	public Page<Categorie> findByLibelle(Pageable p);
	
}
