package com.infinite.SpringbootExample.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.SpringbootExample.Model.Complaint;
import com.infinite.SpringbootExample.service.IUserService;

@Controller
public class ComplaintController {

	@Autowired
	IUserService userservice;

	@RequestMapping(value = "/complaintlist", method = RequestMethod.POST, headers = "Accept=application/json")
	public String registered(Model model) {
		String randomToken=generateRandomToken();
		model.addAttribute("token", randomToken);
		model.addAttribute("comp", new Complaint());
		model.addAttribute("listOfComplaints", userservice.getAllComplaints());
		return "complaint";
	}

	@RequestMapping(value = "/addComplaint", method = RequestMethod.GET, headers = "Accept=application/json")
	public String addCustomer( @ModelAttribute("comp") Complaint comp) {
		userservice.update(comp);
		return "redirect:/complaintlist";
	}
	private String generateRandomToken()
	{
		String randomToken=UUID.randomUUID().toString();
		return randomToken;
	}
	@RequestMapping("/logout")
	public String gologout(HttpSession session){
		session.invalidate();
		return "loginpage";
	}

}
