package com.proj.weekproject.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proj.weekproject.entity.User;
import com.proj.weekproject.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("UserRunner...");

//		User u1 = userService.createAdminUser();
//		System.out.println(u1);
		User u2 = userService.createFakeUser();
//		User u3 = userService.createFakeUser();
//		
//		User u4 = userService.createCustomUser();
//		u4.setUsername("Giuseppe");
//		u4.setLastName("Verdi");
//		u4.setEmail("g.verdi@example.com");
//		
//		userService.insertUser(u1);
		userService.insertUser(u2);
//		userService.insertUser(u3);
//		userService.insertUser(u4);
		
//		User editUser = userService.getByID(4);
//		editUser.setAge(99);
//		
//		userService.updateUser(editUser);
		
//		User editUser = userService.getByID(6);
//		userService.deleteUser(editUser);
		
	// userService.getAll().forEach(u -> System.out.println(u));
	
	System.out.println(u2);
//		System.out.println(u3);
//		System.out.println(u4);
	}
}
