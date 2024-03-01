package com.fashionsuperior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
    com.fashionsuperior.utils.FileUploadProperties.class
})
public class FashionSuperior {

	public static void main(String[] args) {
		SpringApplication.run(FashionSuperior.class, args);
	}

}
