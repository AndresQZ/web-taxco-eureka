package web.taxco.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class WebTaxcoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTaxcoEurekaApplication.class, args);
	}

}
