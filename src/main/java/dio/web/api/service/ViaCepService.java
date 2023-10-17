package dio.web.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.web.api.model.Endereco;

/**
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author Falvojr
 * @Aluna Debora
 *
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

		@GetMapping("/{cep}/json/")
		Endereco consultarCep(@PathVariable("cep") String cep);
	}
