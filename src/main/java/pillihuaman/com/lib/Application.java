package pillihuaman.com.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;
@ComponentScan(basePackages = {"pillihuaman.com.basebd.config","pillihuaman.com.basebd","pillihuaman.com.security"})
public class Application {

	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8091"));
		app.run(args);
	}


}

