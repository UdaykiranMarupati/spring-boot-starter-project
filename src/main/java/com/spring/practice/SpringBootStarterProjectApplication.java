package com.spring.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.practice.model.Customer;
import com.spring.practice.model.CustomerRepository;

@SpringBootApplication
public class SpringBootStarterProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			Customer customer = repository.findOne(1L);

			System.out.println(customer.getFirstName());

		};
	}

}
