package com.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.sct.repository","com.sct.controller"}) 
public class SctSpringbootRestDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SctSpringbootRestDataApplication.class, args);
	}

}

