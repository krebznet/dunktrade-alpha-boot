package com.dunktrade.boot;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

	// SLF4J's logging instance for this class
	// We could have used LoggerFactory.getLogger(Slf4jSpringBootApplication.class)
	// as well
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	// This is what SLF4J uses to bind to a specific logging implementation
	final StaticLoggerBinder binder = StaticLoggerBinder.getSingleton();

	public void run(String... args) {
		System.out.println(binder.getLoggerFactory());
		System.out.println(binder.getLoggerFactoryClassStr());

		LOGGER.debug("hello world");
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
