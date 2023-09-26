package com.nttdata.bank.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bank.user.domain.service.UserService;

@RestController
public class UserApi {
	@Autowired
	UserService service;  
}
