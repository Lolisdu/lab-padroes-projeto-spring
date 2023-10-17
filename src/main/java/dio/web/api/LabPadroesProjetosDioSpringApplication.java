package dio.web.api;

/**
 * Projeto Spring Boot gerado pela IDE;
 * Os módulos selecionados;
 * Spring Data JPA;
 * Spring Web;
 * OpenFeign;
 * Mysql Database;
 * 
 * @Author Débora
 * @Professor Falvojr
 */

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
public class LabPadroesProjetosDioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosDioSpringApplication.class, args);
		
		
	}

}
