package dio.web.api.service;

/**
 * @author Falvojr
 * @Aluna Debora
 */

import dio.web.api.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
