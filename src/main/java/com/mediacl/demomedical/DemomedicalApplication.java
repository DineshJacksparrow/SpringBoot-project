package com.mediacl.demomedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemomedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomedicalApplication.class, args);
		// new code going to added....
		DemomedicalApplication d = new DemomedicalApplication();
		DemomedicalApplication dd = new DemomedicalApplication();
	}

}
