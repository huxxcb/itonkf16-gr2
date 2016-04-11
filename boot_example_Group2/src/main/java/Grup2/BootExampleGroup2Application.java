package Grup2;

import Grup2.repositories.PieRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.*;

@SpringBootApplication
public class BootExampleGroup2Application {

	private final Faker faker = new Faker();

	public static void main(String[] args) {
		SpringApplication.run(BootExampleGroup2Application.class, args);
	}

	@Bean
	public CommandLineRunner initializeDb(PieRepository repository){
		return (args) -> {
			repository.deleteAll();
			//Insert some random pies
			for(int i = 0; i < 20; i++) {
				repository.save(new Pie(faker.lorem().word(), faker.lorem().sentence()));
			}
		};
	}
}
