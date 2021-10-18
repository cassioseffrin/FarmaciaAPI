package br.edu.cassio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;

@Path("cliente")
public class ClienteResource {

	private ClienteInterface clienteInterface;

	@Autowired
	public ClienteResource(ClienteInterface cliente) {
		this.clienteInterface = cliente;
	}

	@GET
	public String getCliente(@QueryParam("id") Integer id) {
		return this.clienteInterface.getCliente(id);
	}
}