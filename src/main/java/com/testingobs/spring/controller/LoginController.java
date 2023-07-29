package com.testingobs.spring.controller;

import com.testingobs.spring.dto.DataTable;
import com.testingobs.spring.dto.User;
import com.testingobs.spring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Locale;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String user (User user, Model model) {
		 try {
			 List<DataTable> dataTable = this.loginService.verifyLoginData(user);
			 model.addAttribute("userName", user.getUserName());
			 model.addAttribute("listMark", dataTable);
		 }catch (Exception e){
			 e.printStackTrace();
			 System.out.println("INVALID LOGIN");
			 model.addAttribute("error", "Invalid Login");
			 return "home";
		 }
		return "user";
	}
}
