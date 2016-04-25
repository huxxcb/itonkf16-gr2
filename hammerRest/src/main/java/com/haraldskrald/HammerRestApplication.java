package com.haraldskrald;

import com.github.javafaker.Faker;
import com.haraldskrald.Models.Hammer;
import com.haraldskrald.Repositories.HammerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HammerRestApplication {

	private final Faker faker = new Faker();

	public static void main(String[] args) {
		SpringApplication.run(HammerRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeDb(HammerRepository repository){
		return (args) -> {
			repository.deleteAll();
			//Insert some random Hammers
			for(int i = 0; i < 20; i++) {
				repository.save(new Hammer(faker.lorem().word(), faker.lorem().word(), faker.lorem().sentence(), (float)i));
			}
		};
	}
}
