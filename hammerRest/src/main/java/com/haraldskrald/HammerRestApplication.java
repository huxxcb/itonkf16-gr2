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
			/*for(int i = 0; i < 20; i++) {
				repository.save(new Hammer(faker.lorem().word(), faker.lorem().word(), faker.lorem().sentence(), (float)i));
			}*/
			repository.save(new Hammer("HammerTime", "MC", "The hammer that will make you dance", "http://media2.giphy.com/media/kgKrO1A3JbWTK/giphy.gif", 17.99f));
			repository.save(new Hammer("Old Hammer", "Middleage", "Cheapest hammer on the market", "http://www.animated-gifs.eu/objects-hammers/0010.gif", 2.99f));
			repository.save(new Hammer("The hammer of tomorrow", "FutureHammers inc.", "Not sure if this is a hammer", "https://m.popkey.co/a355c7/46gy1.gif", 99.99f));
		};
	}
}
