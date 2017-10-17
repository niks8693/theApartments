package com.niks.apartments.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.niks.apartments.pojo.User;
import com.niks.apartments.service.LoginService;


@Controller
@SessionAttributes("username")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/signup")
	public String getSignUpPage(Model model){
		User user=new User();
		model.addAttribute("user", user);
		return "signup";
	}
	
	@PostMapping("/signup")
	public String processSignup(@ModelAttribute("user") User user){
		System.out.println("User from processSignup()-->"+user.toString());
		loginService.saveUser(user);
		
		return "redirect:/signin";
	}
	
	@GetMapping("/signin")
	public String getSigninPage(Model model){
		User user=new User();
		model.addAttribute("user", user);
		
		return "signin";
	}
	
	
	
	@PostMapping("/signin")
	public String processSignin(@ModelAttribute("name") User user,Model model){
		System.out.println("User from processSignin()-->"+user.toString());
		String username=user.getUsername();
		String password=user.getPassword();
		boolean isAuthenticated=loginService.authenticateUser(username,password);
		if(isAuthenticated){
			model.addAttribute("username", username);
			
			return "redirect:/";
		}
		else{
			return "redirect:/signin";
		}
		
		
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status,HttpSession session){
	status.setComplete();
	
	return "redirect:/";
		
	}
	

}
