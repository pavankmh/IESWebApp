package com.iesweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iesweb.domain.AccountDTO;
import com.iesweb.service.AdminService;



@Controller
public class AccountController {
	
	@Autowired
	private AdminService adminService;


	@GetMapping("/uniqueMailCheck")
	public @ResponseBody String isEmailUnique(@RequestParam("email") String email) {
		boolean isUnique = adminService.isUniqueEmail(email);
		return isUnique ? "UNIQUE" : "DUPLICATE";
	}
	
	
	@PostMapping("/accountRegistration")
	public String handleSubmitButtn(@ModelAttribute("accountDTO")AccountDTO accountDTO,Model model) {
	
		boolean isSaved=adminService.saveAccount(accountDTO);
		if(isSaved){
			model.addAttribute("succMsg","Account Registration Successfull Please Check ");
		}
		else {
			model.addAttribute("failMsg","User Registration Failed Please Try Again");
		}
		
		return "acntregisterform";
	}
	
}
