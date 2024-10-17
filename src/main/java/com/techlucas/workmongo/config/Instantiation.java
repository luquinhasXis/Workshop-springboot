package com.techlucas.workmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.techlucas.workmongo.domain.User;
import com.techlucas.workmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User lucas = new User(null, "Lucas Silva", "lucaszin174@gmail.com");
		User fernando = new User(null, "Fernando Bob", "fernand0smt@gmail.com");
		User luana = new User(null, "Luana batista", "luaminguante@gmail.com");		
		
		userRepository.saveAll(Arrays.asList(lucas, fernando, luana));
	}	
}
