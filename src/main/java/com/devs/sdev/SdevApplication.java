package com.devs.sdev;

import com.devs.sdev.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.devs.sdev")
@Import(AppConfig.class)
public class SdevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdevApplication.class, args);
	}

}
