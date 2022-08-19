package com.example.Hello;

import com.example.Hello.entities.Laptop;
import com.example.Hello.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(HelloApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// crear
		Laptop laptop1 = new Laptop(null,"HP",130.400);
		Laptop laptop2 = new Laptop(null,"eNova",100.000);

		// muestra el stock antes de guardarlas
		System.out.println("Laptop disponible: " + repository.findAll().size());

		// almacenar
		repository.save(laptop1);
		repository.save(laptop2);

		//recuperar
		System.out.println("Laptops disponibles: " + repository.findAll().size());


	}

}
