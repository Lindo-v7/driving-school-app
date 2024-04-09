package com.drivingSchoolApp.DrivingSchoolApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.drivingSchoolApp.DrivingSchoolEntities")
public class DrivingSchoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrivingSchoolAppApplication.class, args);
	}

}
