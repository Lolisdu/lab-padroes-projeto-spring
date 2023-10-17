package dio.web.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.web.api.model.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
