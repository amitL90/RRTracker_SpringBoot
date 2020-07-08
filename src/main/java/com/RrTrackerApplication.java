package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan({"com","com.POJO","com.repository"})
public class RrTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RrTrackerApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigure() {
		return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE").allowedHeaders("*").allowedOrigins("http://localhost:4200/");
				}
			
		};
	}


}
