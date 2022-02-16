package com.claim.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Account;
import com.claim.entity.User;
import com.claim.service.AccountService;




@Controller
public class AccountController {

 private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService){
	this.accountService = accountService;
	}

	@GetMapping("/add-account")
	public ModelAndView addAccount(Model model) {

		return new ModelAndView("add-account", "account", new Account());
	}
	@PostMapping("/add-account")
	public String handleAddAccount(Model model, @ModelAttribute("account") Account account, HttpSession session) {
		accountService.save(account);
		model.addAttribute("newAccount", account);
		return "account";
	}
	@GetMapping("/account")
	public ModelAndView account(Model model) {

		return new ModelAndView("account", "account", new Account());
	}
	@PostMapping("/account")
	public String handleList(Model model, @ModelAttribute("account") Account account, HttpSession session) {
		
		Account accountFromDatabase = accountService.accountList(account.getAccountName());
		model.addAttribute("accountFromDatabase", accountFromDatabase);
		return "account";
	}
//	@GetMapping("/account-list")
//	public ModelAndView List(Model model) {
//		return new ModelAndView("account", "account", new Account());
//	}
//	@PostMapping("/account-list")
//	public String handleList(Model model, @ModelAttribute("account") Account account, HttpSession session) {
//		
//		Account accountFromDatabase = accountService.accountList(account.getAccountName());
//		model.addAttribute("accountFromDatabase", accountFromDatabase);
//		return "home";
//	}
//	
}
