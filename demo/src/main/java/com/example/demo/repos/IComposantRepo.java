/**
 * 
 */
package com.example.demo.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.Composant;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface IComposantRepo extends PagingAndSortingRepository<Composant, Long>{

}
