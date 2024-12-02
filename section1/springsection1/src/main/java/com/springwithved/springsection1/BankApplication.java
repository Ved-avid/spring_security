package com.springwithved.springsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//If the compenent is not in the parent package then we can specify the path for spring to scan the component
// @ComponentScan("com.springwithved.springsection1.controller")
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
