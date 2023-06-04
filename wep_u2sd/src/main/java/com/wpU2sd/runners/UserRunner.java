package com.wpU2sd.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wpU2sd.entities.User;
import com.wpU2sd.services.UserService;
@Component
public class UserRunner implements CommandLineRunner  {
	@Autowired UserService us;
	@Override
	public void run(String... args) throws Exception {

		System.out.println("UserRunner...");
		User u1 = us.createAdminUser();
		User u2 = us.createUserFake();
		User u3 = us.createUserFake();
	
	User u4 = us.createUserNoParamsBean();
		u4.setUsername("GiuseppeVerdoni");
		u4.setFullname("Giuseppe Verdi");
		u4.setEmail("g.verdi@example.com");
		us.save(u2);
		us.save(u1);
		us.save(u3);
		us.save(u4);
	System.out.println(u2);
	System.out.println(u1);
	System.out.println(u3);
	System.out.println(u4);
	}

}
