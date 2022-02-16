package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import com.claim.entity.User;

import com.claim.service.UserService;




@Controller
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService){
	this.userService = userService;
	}
	
	@GetMapping("/")
	public String welcome(Model model) {
		return "index";	
	}
	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {

		return new ModelAndView("sign-up", "user", new User());
	}
	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("user") User user, HttpSession session) {
		userService.save(user);
		model.addAttribute("newUser", user);
		return "thank-you";
	}
	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "user", new User());
	}
	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("user") User user, HttpSession session) {
		
		User userFromDatabase = userService.findUserByLogin(user.getEmail(), user.getPassword());
		model.addAttribute("userFromDatabase", userFromDatabase);
		return "home";
	}
	
}	

