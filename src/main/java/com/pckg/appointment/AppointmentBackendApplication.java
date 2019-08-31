package com.pckg.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AppointmentBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppointmentBackendApplication.class, args);
		System.out.println("HELLO => " + new Date());
	}

}
