package com.dunktrade.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
		System.out.println("Lets add a breakpoint!!");
		int i = 0; 
		if(0 == 0) { 
			System.out.println("stop here at breakpoint!");
		}
		System.out.println("Hello China!");
	}
	

}

