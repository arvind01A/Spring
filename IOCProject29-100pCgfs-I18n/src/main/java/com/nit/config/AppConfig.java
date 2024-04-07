package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	//configure the pre-defined class as the spring beans
	@Bean
	@Lazy
	public LocalDateTime createDateTime() {
		System.out.println("AppConfig.createDateTime()");
		return LocalDateTime.now();
	}
}
