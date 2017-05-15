package com.rentch.portal.web.controller;

import java.security.Principal;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rentch.portal.user.Role;
import com.rentch.portal.user.User;
import com.rentch.portal.user.UserService;

@Controller
public class Sorter {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/sorter", method = RequestMethod.GET)
	public String createUser(Principal principal) {
		User current = service.byUserName(principal.getName());
		switch(current.getRole()){
			case ROLE_ADMIN:
				return "redirect:/admin/main"; 
			case ROLE_LANDLORD:
				return "redirect:/landlord/main";
			case ROLE_TENANT:
				return "redirect:/tenant/main";
			default:
				return "redirect:/visitor/main";	
		}
		
	}

}
