package com.newtonapple.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newtonapple.accounts.dto.CustomerDto;
import com.newtonapple.accounts.service.IAccountsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api")
@Slf4j
public class AccountsController {
	
	@Autowired
	private IAccountsService accountsService;
	
	@PostMapping("/create")
	public String createAccount(@RequestBody CustomerDto customerDto) {
		log.info("AccountsController :: createAccount");
		accountsService.createAccount(customerDto);
		return "Account created Successfully";
	}
	
	@GetMapping("/fetch")
	public CustomerDto fetchAccountDetails(String mobileNumber) {
		return accountsService.fetchAccount(mobileNumber);
	}
	

}
