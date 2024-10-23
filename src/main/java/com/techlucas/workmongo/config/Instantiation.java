package com.techlucas.workmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.techlucas.workmongo.domain.Post;
import com.techlucas.workmongo.domain.User;
import com.techlucas.workmongo.repository.PostRepository;
import com.techlucas.workmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User lucas = new User(null, "Lucas Silva", "lucaszin174@gmail.com");
		User fernando = new User(null, "Fernando Bob", "fernand0smt@gmail.com");
		User luana = new User(null, "Luana batista", "luaminguante@gmail.com");		
		
		Post post1 = new Post(null, sdf.parse("09/09/2024"), "Primeiro dia no trabalho", "Vou iniciar meu primeiro dia como segurança virtual", lucas);
		Post post2 = new Post(null, sdf.parse("18/10/2024"), "Dia de praia", "Saindo do trabalho irei direto para a praia curtir!!", lucas);
	
		userRepository.saveAll(Arrays.asList(lucas, fernando, luana));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}	
}
