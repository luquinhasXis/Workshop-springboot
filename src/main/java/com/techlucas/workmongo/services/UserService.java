package com.techlucas.workmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlucas.workmongo.domain.User;
import com.techlucas.workmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
