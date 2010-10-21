/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Client;
import com.example.demo.models.Role;
import com.example.demo.models.User;

/**
 * @author BENLAHMAR EL Habib
 *
 */
public interface Icustomur {

	public User inscrire(Client c, User u);
	public User addRole2User(Long idu, Role r);
	public User Authentificat(String log,String pass);
	public Client getClient4User(Long idUser);
	public List<Role> getroles(Long idclient);
	public List<Client> clients();
	public User EditCompte(Long idclient, User compte);
	public User myCompte(Long idclient);
	
}
