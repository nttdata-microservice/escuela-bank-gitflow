package com.nttdata.bank.user.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bank.user.domain.repository.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	UserRepository repo;
}
