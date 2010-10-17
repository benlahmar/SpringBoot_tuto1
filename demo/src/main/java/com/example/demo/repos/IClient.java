/**
 * 
 */
package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Client;

/**
 * @author ISGA
 *
 */
public interface IClient extends CrudRepository<Client, Long>{
	

}
