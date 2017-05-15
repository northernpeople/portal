package com.rentch.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/landlord")
public class LandlordController {
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main(){
		return "landlord/main";
	}
	

}
