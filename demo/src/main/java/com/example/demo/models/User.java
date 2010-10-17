/**
 * 
 */
package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * @author ISGA
 *
 */
@Entity

public class User {

	@Id
	@GeneratedValue
	Long iduser;
	String username;
	String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<Role> roles=new ArrayList<Role>();
	
	@OneToOne(mappedBy = "compte",cascade = CascadeType.ALL)
	Client client;
	
	/**
	 * @return the iduser
	 */
	public Long getIduser() {
		return iduser;
	}
	/**
	 * @param iduser the iduser to set
	 */
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}