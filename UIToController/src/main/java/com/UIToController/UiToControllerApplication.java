package com.UIToController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class UiToControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiToControllerApplication.class, args);
	}

}
