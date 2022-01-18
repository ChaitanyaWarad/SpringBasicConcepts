package com.javatpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(NewWorld.class)
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
