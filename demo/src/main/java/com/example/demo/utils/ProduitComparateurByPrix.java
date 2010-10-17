/**
 * 
 */
package com.example.demo.utils;

import java.util.Comparator;

import com.example.demo.models.Produit;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public class ProduitComparateurByPrix implements Comparator<Produit> {

	@Override
	public int compare(Produit p1, Produit p2) {
		
		return (int) (p1.getPrix()-p2.getPrix());
	}

}
