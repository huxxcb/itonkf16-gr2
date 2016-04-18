package itonkf16.gr2;

import com.github.javafaker.Faker;
import itonkf16.gr2.Models.Tent;
import itonkf16.gr2.Repositories.TentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HaraldskraldRestApplication {

	private final Faker faker = new Faker();

	public static void main(String[] args) {
		SpringApplication.run(HaraldskraldRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeDb(TentRepository repository){
		return (args) -> {
			repository.deleteAll();
			//Insert some random pies
			for(int i = 0; i < 20; i++) {
				repository.save(new Tent(faker.lorem().word(), faker.lorem().word(), faker.lorem().sentence(), (float)i));
			}
		};
	}
}
