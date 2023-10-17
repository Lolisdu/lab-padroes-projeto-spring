package dio.web.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.web.api.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}


