package Reto3_G5.Reto3_G5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3_G5.Reto3_G5.Model"})  // scan JPA entities
@SpringBootApplication
public class Reto3G5Application {
    



	public static void main(String[] args) {
		SpringApplication.run(Reto3G5Application.class, args);
	}

}
