/**
 * 
 */
package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.models.Client;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface IClient extends PagingAndSortingRepository<Client, Long>{
	

}
