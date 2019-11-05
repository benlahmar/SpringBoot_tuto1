/**
 * 
 */
package com.example.demo.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Command;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface ICommandRepo extends JpaRepository<Command, Long>{
	
	public List<Command> findByDateBetween(Date dd,Date df);
	public List<Command> findByClientIdclient(Long idclient);
	@Query("from Command c where c.getht() > ?1")
	public List<Command> getcommandplus(double ht);

}
