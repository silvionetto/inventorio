package com.silvionetto.inventario;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	ApplicationRunner init (EspecieRepository repository) {
		return args -> {
			Stream.of("Manga","Jabuticaba","Parreira").forEach(nome -> {
				Especie especie = new Especie();
				especie.setNome(nome);
				repository.save(especie);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
