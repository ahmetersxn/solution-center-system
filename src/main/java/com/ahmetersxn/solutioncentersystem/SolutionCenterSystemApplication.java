package com.ahmetersxn.solutioncentersystem;

import com.ahmetersxn.solutioncentersystem.model.Role;
import com.ahmetersxn.solutioncentersystem.model.User;
import com.ahmetersxn.solutioncentersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;



@SpringBootApplication
public class SolutionCenterSystemApplication implements CommandLineRunner {

	@Autowired
	UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(SolutionCenterSystemApplication.class, args);
	}

	@Override
	public void run(String... params) throws Exception {
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setEmail("admin@email.com");
		admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));

		userService.signup(admin);

		User client = new User();
		client.setUsername("client");
		client.setPassword("client");
		client.setEmail("client@email.com");
		client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));

		userService.signup(client);
	}

}
