package com.example.ConversorDeMoedas;

import com.example.ConversorDeMoedas.services.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorDeMoedasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversorDeMoedasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { Menu.menuLoop(); }
}
