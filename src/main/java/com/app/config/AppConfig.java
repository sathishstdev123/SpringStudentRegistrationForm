package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.app")
@EnableWebMvc
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver inv() {
		return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
		
	}

}
