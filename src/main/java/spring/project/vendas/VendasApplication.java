package spring.project.vendas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.project.vendas.testAnnotation.Animal;
import spring.project.vendas.testAnnotation.Gato;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Value("${application.name}")
	private String applicationName;

	@Gato
	private Animal animal;

	@Bean("executarAnimal")
	public CommandLineRunner executar(){
		return args -> {
			this.animal.especie();
		};
	};


	@GetMapping("/hello")
	public String helloWorld(){

		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
