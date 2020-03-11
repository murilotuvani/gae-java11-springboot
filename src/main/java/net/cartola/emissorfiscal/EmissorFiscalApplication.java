package net.cartola.emissorfiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @see https://www.youtube.com/watch?v=qx_T6-EKkBE
 * ./mvnw package
 * gcloud app deploy target/[arquivogerado].jar
 * 
 * @see cloud.google.com/appegine/docs/standard/java11/
 */
@SpringBootApplication
public class EmissorFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmissorFiscalApplication.class, args);
	}
//
//	@RestController
//	class HelloController {
//		@GetMapping("/")
//		String hello() {
//			return "Hello from App Engine";
//		}
//	}

}
