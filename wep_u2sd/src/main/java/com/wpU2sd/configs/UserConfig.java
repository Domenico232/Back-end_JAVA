	package com.wpU2sd.configs;
	import java.util.Locale;

	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.wpU2sd.entities.User;

	@Configuration
	public class UserConfig {

		@Value("${admin.username}")
		private String username;
		@Value("${admin.fullname}")
		private String fullname;
		@Value("${admin.email}")
		private String email;

		@Bean("UserAdminBean")
		@Scope("singleton")
		User userAdmin() {
			return new User(
					this.username, this.fullname, this.email);
		}

		@Bean("UserNoParamsBean")
		@Scope("prototype")
		User userNoParams() {
			return new User();
		}

		@Bean("UserWithParamsBean")
		@Scope("prototype")
		User userWithParams(
				String username, String fullname, String email) {
			return new User(username, fullname, email);
		}

		@Bean("UserFakeBean")
		@Scope("prototype")
		User userFake() {
			Faker faker = new Faker(new Locale("it"));
			String fullname = faker.name().fullName();
			String username;
			try {
				username = fullname.split(" ")[0].toLowerCase();
			} catch (Exception e) {
				username = fullname.toLowerCase();
			}
			String email = String.format(
					"%s@%s", username, faker.internet().domainName().trim());
			User user = new User();
			user.setUsername(username);
			user.setFullname(fullname);
			user.setEmail(email);
			return user;
		}}