package com.niks.apartments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.niks.apartments.pojo.User;


@Controller
public class LoginController {
	
	@GetMapping("/signup")
	public String getSignUpPage(Model model){
		User user=new User();
		model.addAttribute("user", user);
		return "signup";
	}
	
	@PostMapping("/signup")
	public String processSignup(@ModelAttribute("user") User user){
		System.out.println("User from processSignup()-->"+user.toString());
		
		return "redirect:/signin";
	}
	
	@GetMapping("signin")
	public String getSigninPage(){
		
		
		return "signin";
	}
	

}
