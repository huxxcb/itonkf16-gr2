package com.haraldskrald;

import com.github.javafaker.Faker;
import com.haraldskrald.Models.Bike;
import com.haraldskrald.Repositories.BikeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BikeRestApplication {

	private final Faker faker = new Faker();

	public static void main(String[] args) {
		SpringApplication.run(BikeRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeDb(BikeRepository repository){
		return (args) -> {
			repository.deleteAll();
			//Insert some random pies
			for(int i = 0; i < 20; i++) {
				repository.save(new Bike(faker.lorem().word(), faker.lorem().word(), faker.lorem().sentence(), (float)i));
			}
		};
	}


}
