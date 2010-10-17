package com.example.demo.models.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface IProduitDTO {

	String getDesignation();
	double getPrix();
	
	@Value("#{target.designation + ' ' + target.prix}")
	String getinfo();
}
