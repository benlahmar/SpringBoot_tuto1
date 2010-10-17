package com.example.demo.repos;



import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Page<User> findByUsername(String username,Pageable p);
	User findByUsernameAndPassword(String un,String ps);
	
	//List<User> findByDate_creationBetween(Date dd, Date df);
	
	
	
}
