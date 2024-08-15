package com.programapi.programcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProgramcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramcrudApplication.class, args);
	}

}
