package com.arg.javatechi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringWithJwt2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJwt2Application.class, args);
	}

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		
		System.out.println("corsConfigurer calling..........");
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedHeaders("*").allowedOrigins("*").allowedMethods("*")
				.allowCredentials(false);
			}
		};
	}*/
}
