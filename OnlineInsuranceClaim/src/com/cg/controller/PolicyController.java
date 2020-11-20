package com.cg.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.model.Policy;
import com.cg.model.Users;
import com.cg.service.LService;
import com.cg.service.PolicyService;

@Controller
//@RequestMapping("/policy")

public class PolicyController
{
	@Qualifier(value = "pservice")
	@Autowired
	private PolicyService service;
	
	 @RequestMapping(value="/viewpolicy.htm", method=RequestMethod.GET)
	 public String getPolicies(Model model,@RequestParam String username) 
	  {   	
		 	System.out.println( username);
		 	//model.addAttribute("user", username);
		 	
		 	List<Policy> res= service.getPolicies(username);
		 	 		
 	   		model.addAttribute("usernameFromQueryParam", username);
 	   	    model.addAttribute("lis", res);
 	   	    
 	   		return "policy";
	 }
	 
}
