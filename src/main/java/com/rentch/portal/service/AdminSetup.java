package com.rentch.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.rentch.portal.user.Role;
import com.rentch.portal.user.User;
import com.rentch.portal.user.UserService;





@Service
@Profile({"production", "dev"})
public class AdminSetup {
	
	@Value("${adminEmail}")
	String adminEmail;
	
	@Value("${adminPassword}")
	String adminPassword;
	
	@Autowired
	UserService userService;
	
	@Scheduled(fixedRate = Long.MAX_VALUE)
	public void setUpAdmin(){
		userService.create(new User(adminEmail, adminPassword), Role.ROLE_ADMIN);
		System.out.println("admin account set up: "+adminEmail +" : ******"+ adminPassword.substring(6));
	}
}
