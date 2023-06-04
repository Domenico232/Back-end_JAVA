package com.wpU2sd.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wpU2sd.entities.User;


public interface UserRepo extends JpaRepository<User, Long> {

		User findByUsername(String username);

	}

