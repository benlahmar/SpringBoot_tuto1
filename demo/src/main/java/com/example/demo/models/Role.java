/**
 * 
 */
package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author BENLAHMAR EL Habib
 *
 */
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idrole;
	
	String role;
	
	@ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	List<User> users=new ArrayList<>();
	
	/**
	 * @return the idrole
	 */
	public Long getIdrole() {
		return idrole;
	}
	/**
	 * @param idrole the idrole to set
	 */
	public void setIdrole(Long idrole) {
		this.idrole = idrole;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
