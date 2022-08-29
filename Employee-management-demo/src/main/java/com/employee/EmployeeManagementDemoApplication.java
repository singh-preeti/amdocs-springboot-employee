package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration+@EnableConfiguration+@ComponentScan
public class EmployeeManagementDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementDemoApplication.class, args);
	}

}
