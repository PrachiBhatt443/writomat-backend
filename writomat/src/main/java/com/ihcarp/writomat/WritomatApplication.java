package com.ihcarp.writomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
//		(exclude = {UserDetailsServiceAutoConfiguration.class})
public class WritomatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WritomatApplication.class, args);
	}

}
