package SpringProjectMusti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"SpringThird"})
@SpringBootApplication
public class SpringProjectMustiApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringProjectMustiApplication.class, args);

	}

}
