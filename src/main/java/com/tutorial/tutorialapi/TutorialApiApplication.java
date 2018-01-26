package com.tutorial.tutorialapi;

import com.tutorial.tutorialapi.dao.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.tutorial.tutorialapi.Repository.*;
import org.springframework.boot.actuate.health.Health;

import java.util.stream.Stream;

@SpringBootApplication
public class TutorialApiApplication {

	@Bean
	CommandLineRunner dummyCLR(UserRepository userRepo) {
		return args -> {
			Stream.of("Dave", "George", "Rod", "Mattias")
					.forEach(name -> userRepo.save(new User(name)));
			userRepo.findAll().forEach(System.out::println);
		};
	}

	@Bean
	HealthIndicator healthIndicator() {
		return () -> Health.status("I <3 JFokus!").build();
	}
	public static void main(String[] args) {
		SpringApplication.run(TutorialApiApplication.class, args);
	}
}
