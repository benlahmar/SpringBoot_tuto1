package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.models.Client;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repos.IClient;
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
		UserRepository pp= (UserRepository) context.getBean("userRepository");
		RoleRepository rp=(RoleRepository) context.getBean("roleRepository");
//		u=pp.save(u);
		Role r=new Role();
		r.setRole("ffff");
		r=rp.save(r);
		
		
//		u.getRoles().add(r);
//		pp.save(u);
		User u = pp.findById(4L).get();
		u.getRoles().add(r);
		pp.save(u);
		List<Role> rs = u.getRoles();
		rs.stream().map(x->x.getRole()).forEach(System.out::println);

	}

}
