package com.proj.weekproject.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.proj.weekproject.entity.User;
import com.proj.weekproject.repository.UserDaoRepository;

@Service
public class UserService {
	@Autowired 
	UserDaoRepository db;
	
	@Autowired
    @Qualifier("FakerUserBean")
    ObjectProvider<User> userFakeProvider;

    @Autowired
    @Qualifier("AdminUserBean")
    ObjectProvider<User> adminUserProvider;

    @Autowired
    @Qualifier("CustomUserBean")
    ObjectProvider<User> customUserProvider;

    public User createFakeUser() {
        return userFakeProvider.getObject();
    }

    public User createAdminUser() {
        return adminUserProvider.getObject();
    }

    public User createCustomUser() {
        return customUserProvider.getObject();
    }
    
    public void insertUser(User u) {
    db.save(u);
    System.out.println("User "+ u.getEmail());
    }
}
