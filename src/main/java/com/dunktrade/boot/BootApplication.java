package com.dunktrade.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
		// lets test some code here with the 
		// debugger in eclipse
		
		// create a infinite loop
		int counter = 0; 
		while(true) { 
			System.out.println("Loop Count " + counter);
			counter++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	

}

