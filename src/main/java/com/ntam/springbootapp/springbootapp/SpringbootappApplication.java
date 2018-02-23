package com.ntam.springbootapp.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class SpringbootappApplication {

	public SpringbootappApplication() {
		Logger logger = LogManager.getRootLogger();
		logger.info( "Starting...");
		//logger.error("This is the log message", new Exception("testing!"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}
}
