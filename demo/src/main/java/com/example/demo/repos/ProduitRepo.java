package com.example.demo.repos;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.Produit;

public interface ProduitRepo extends PagingAndSortingRepository<Produit, Long>{
	
	
	<T> Set<T> findByCategorieIdcategorie(Long idcategorie,Class<T> t);
	<T> Page<T> findByDesignationContaining (String key,Class<T> t,Pageable pg);

}
