package com.niks.apartments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.niks.apartments.pojo.Apartment;

@Controller
@SessionAttributes("username")
public class ApartmentController {
	
	@GetMapping("/newapartment")
	public String getNewApartmentPage(Model model){
		
		Apartment apartment=new Apartment();
		model.addAttribute("apartment", apartment);
		return "newapartment";
	}
	
	@PostMapping("/newapartment")
	public String processNewApartment(@ModelAttribute("apartment") Apartment apartment){
		System.out.println("Apartment in process from processNewApartment()-->"+apartment.toString());
		return "redirect:/";
	}

}
