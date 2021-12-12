package com.pjy.yaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YayaApplication {

	public static void main(String[] args) {

		SpringApplication.run(YayaApplication.class, args);
		Person.name = "John";
		String name = Person.hello("Mary", 12);

	}

}
