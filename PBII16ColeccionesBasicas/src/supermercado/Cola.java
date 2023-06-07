package supermercado;

import java.util.HashSet;

public class Cola {

	private HashSet<Cliente> clientes = new HashSet<Cliente>();
	
	public HashSet<Cliente> getClientes() {
		return clientes;
	}
	
	public Integer getCantidadDeClientes() {
		return clientes.size();
	}
	
	public Boolean agregarClienteACola(Cliente cliente) {
		return clientes.add(cliente);
	}
	
	public Boolean eliminarCliente(Cliente cliente) {
		return clientes.remove(cliente);
	}
	
	
}
