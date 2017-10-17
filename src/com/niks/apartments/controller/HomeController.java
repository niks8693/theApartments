package com.niks.apartments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class HomeController {
	
	@RequestMapping("/")
	public String getHomePage(){
		return "home";
	}

}
