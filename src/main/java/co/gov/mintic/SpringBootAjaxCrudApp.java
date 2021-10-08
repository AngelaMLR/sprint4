package co.gov.mintic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.gov.mintic")
public class SpringBootAjaxCrudApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAjaxCrudApp.class, args);
	}

}
