package com.iesweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.iesweb.domain.AccountDTO;

@Controller
public class AdminController {

	@GetMapping(value = "/")
	public String loadWelcomePage(Model model) {

		return "index";
	}
	
	@GetMapping(value = "/AccountRegister")
	public String loadAccountRegistratioForm(Model model) {

	
		AccountDTO accountDTO= new AccountDTO();
		model.addAttribute("accountDTO", accountDTO);
		Map<String, String> rolesMap = new HashMap<String, String>();
		rolesMap.put("Admin", "Admin");
		rolesMap.put("CaseWorker", "CaseWorker");
		model.addAttribute("roles", rolesMap);
		return "acntregisterform";
	}
	
	
}
