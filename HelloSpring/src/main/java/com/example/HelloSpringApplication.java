package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController			//파일 없이 내용을 넘겨
@SpringBootApplication
public class HelloSpringApplication {
	
	@RequestMapping("/")
	String home() {
		return "Test Server A";
	}
		
		@RequestMapping
		String demo() {
		return "데모 페이지에 접속하셨습니다.";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
