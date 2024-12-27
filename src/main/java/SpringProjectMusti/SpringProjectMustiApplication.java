package SpringProjectMusti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"SpringThird"})
@SpringBootApplication
public class SpringProjectMustiApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringProjectMustiApplication.class, args);

	}

}
