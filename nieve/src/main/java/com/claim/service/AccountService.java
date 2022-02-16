package com.claim.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Account;

import com.claim.repository.AccountRepository;


@Service
public class AccountService {
	private AccountRepository accountRepository;

	@Autowired
	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	
	public void save(Account account) {
		accountRepository.save(account);
		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
	}
//	public Account findAccountByName(String accountName) {
//		return accountRepository.findAccountByName(accountName);
//	}
//	
	public Account accountList(String accountName) {
		return accountRepository.findAllByAccountName(accountName);
	}
}
