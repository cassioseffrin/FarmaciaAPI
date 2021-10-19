package br.edu.cassio;

import org.springframework.stereotype.Component;

import br.edu.cassio.dao.ClienteDao;
import br.edu.cassio.model.Cliente;

@Component
public class ClienteService implements ClienteInterface {

	private ClienteDao clienteDao;

	public String getCliente(Integer id) {

		clienteDao = new ClienteDao();
		Cliente cli = clienteDao.buscar(id);

		return "Ola cliente " + cli.getNome() + "!";
	}
}