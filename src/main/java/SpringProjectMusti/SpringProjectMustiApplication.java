package SpringProjectMusti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"SpringThird"})
@ComponentScan(basePackages = {"SpringThird"})
@EnableJpaRepositories(basePackages = {"SpringThird"})
public class SpringProjectMustiApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringProjectMustiApplication.class, args);

	}

}
