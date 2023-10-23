package com.infinite.SpringbootExample.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.SpringbootExample.Model.UserLogin;
import com.infinite.SpringbootExample.service.IUserService;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	IUserService userservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("logindata", new UserLogin());
		//model.addAttribute("listOfCustomers", userservice.getAllCustomers());
		return "loginpage";
	}

	@RequestMapping(value = "/getlogin", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addData(@Valid @ModelAttribute("logindata") UserLogin userLogin, BindingResult result) {
		if (result.hasErrors()) {
			logger.info(result);
			return "loginpage";
		} else if (userLogin.getId() == 0) {
			userservice.insert(userLogin);
		}
		return "homepage";
	}
	
}
