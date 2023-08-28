package pillihuaman.com.segurity.lib;

import org.springframework.boot.SpringApplication;

import java.util.Collections;
public class Application {

	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8091"));
		app.run(args);
	}


}

