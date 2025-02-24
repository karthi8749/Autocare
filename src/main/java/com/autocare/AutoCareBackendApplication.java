package com.autocare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.autocare")
public class AutoCareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCareBackendApplication.class, args);
	}

}
// # ALL REST URL's
// # in application.properties:
// # spring.data.rest.base-path=/api

// * 1st hit - register controller
// * in req body - provide credentials
/* 
request body - i send in postman
 {
  "username": "samreen",
  "password": "s@123",
  "email": "hiphopsamreen@gmail.com"
 }

 response - i get confirmation - of repo.save(record) op - from database itself
 {
  "id": 1,
  "username": "samreen",
  "email": "hiphopsamreen@gmail.com",
  "password": "$2a$12$pwCN2fqgiYTM8OKRDf5rYuvJ2QIZN1rUGy4Ea5N6AoHpZLWt85uiq"
 }
*/
// * now with registered credentials i can login 
// * username is - email
// * password is - s@123