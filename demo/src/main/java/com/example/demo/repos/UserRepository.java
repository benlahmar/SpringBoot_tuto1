package com.example.demo.repos;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Page<User> findByUsername(String username,Pageable p);
	
	
}
