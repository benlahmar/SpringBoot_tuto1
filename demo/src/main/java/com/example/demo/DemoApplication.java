package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.models.Categorie;
import com.example.demo.models.Client;
import com.example.demo.models.Produit;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.models.dtos.IProduitDTO;
import com.example.demo.models.dtos.ProduitDTO;
import com.example.demo.repos.CategorieRepo;
import com.example.demo.repos.IClient;
import com.example.demo.repos.ProduitRepo;
import com.example.demo.repos.RoleRepository;
import com.example.demo.repos.UserRepository;

@SpringBootApplication
public class DemoApplication   {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		
		//Client c=new Client("dd", "qq");
		//SpringApplication.run(DemoApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		IClient ic = (IClient) context.getBean("IClient");
//		
//		ic.save(c);
//		Optional<Client> c1 = ic.findById(1L);
//		System.out.println( c1.get().toString());
//		User u=new User();
//		u.setUsername("alpha");
//		u.setPassword("password");
//		UserRepository pp= (UserRepository) context.getBean("userRepository");
//		RoleRepository rp=(RoleRepository) context.getBean("roleRepository");
////		u=pp.save(u);
//		Role r=new Role();
//		r.setRole("ffff");
//		r=rp.save(r);
//		
//		
////		u.getRoles().add(r);
////		pp.save(u);
//		User u = pp.findById(4L).get();
//		u.getRoles().add(r);
//		pp.save(u);
//		List<Role> rs = u.getRoles();
//		rs.stream().map(x->x.getRole()).forEach(System.out::println);

		CategorieRepo cr=(CategorieRepo) context.getBean("categorieRepo");
		ProduitRepo cp=(ProduitRepo) context.getBean("produitRepo");
		Categorie  c=new Categorie();
		c.setLibelle("lib21");
		c=cr.save(c);
		Produit pt=new Produit();
		pt.setDesignation("clavier22");
		pt.setPrix(1200);
		pt=cp.save(pt);
		pt.setCategorie(c);
		pt=cp.save(pt);
		
		Set<Produit> pr1 = cp.findByCategorieIdcategorie(c.getIdcategorie(), Produit.class);
				for (Produit p : pr1) {
					System.out.println("------"+p.toString());
				}
		
				Set<ProduitDTO> pr2 = cp.findByCategorieIdcategorie(c.getIdcategorie(), ProduitDTO.class);
				for (ProduitDTO p : pr2) {
					System.out.println("------"+p.toString());
				}
				
				
				Set<IProduitDTO> pr3 = cp.findByCategorieIdcategorie(c.getIdcategorie(), IProduitDTO.class);
				for (IProduitDTO p : pr3) {
					System.out.println("------"+p.getinfo());
				}
	}

}
