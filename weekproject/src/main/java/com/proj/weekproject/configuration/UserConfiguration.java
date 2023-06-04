package com.proj.weekproject.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.proj.weekproject.entity.User;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {
   @Value("${user.admin.name}") private String adminUsername;
   @Value("${user.admin.lastname}") private String adminLastName;
   @Value("${user.admin.email}") private String adminEmail;
   
   @Bean("AdminUserBean")
   @Scope("singleton")
   public User adminUser() {
	   return new User();
   }
    
   @Bean("CustomUserBean")
   @Scope("prototype")
   public User customUser() {
	   return new User();
   }
   
   @Bean("FakerUserBean")
   @Scope("prototype")
   public User fakeUser() {
	   Faker fake = Faker.instance(new Locale("it-IT"));
	   User userFake = new User();
	   userFake.setUsername(fake.name().firstName());
	   userFake.setLastName(fake.name().lastName());
	   userFake.setEmail(userFake.getUsername()+"."+userFake.getLastName() + "@example.com");
	   return userFake;
   }
}
