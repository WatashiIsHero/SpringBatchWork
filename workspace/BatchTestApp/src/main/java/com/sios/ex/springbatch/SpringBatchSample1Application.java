package com.sios.ex.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBatchSample1Application {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SpringBatchSample1Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		ApplicationContext context = application.run();
		SpringApplication.exit(context);
	}
}