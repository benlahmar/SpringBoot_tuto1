package com.example.demo.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.Categorie;


public interface CategorieRepo extends PagingAndSortingRepository<Categorie, Long>{

	
}
