package com.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.model.User;
import com.springboot.model.UserRepository;




@SpringBootApplication
@EnableJpaRepositories("com.springboot.model")
@EntityScan("com.springboot.model")
public class Application {

	private static UserRepository userRepository;
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	@Autowired
	public Application(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		User user1 = new User("FirstName1","LastName1");
		userRepository.save(user1);
		User user2 = new User("FirstName2","LastName2");
		userRepository.save(user2);
		User user3 = new User("FirstName3","LastName3");
		userRepository.save(user3);
		log.info("Number of users are : " +userRepository.count());
		
	}

}
