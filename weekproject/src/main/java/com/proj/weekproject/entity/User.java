package com.proj.weekproject.entity;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String lastName;
    private String email;
    
    
	public User() {
		super();
	}


	public User(String username, String lastName, String email) {
		super();
		this.username = username;
		this.lastName = lastName;
		this.email = email;
	}
	
	


	public User(Long id, String username, String lastName, String email) {
		super();
		this.id = id;
		this.username = username;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String fullName) {
		this.lastName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
