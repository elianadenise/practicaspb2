package coleccionesAvanzadas;

import java.util.HashSet;

public class Bar {

	private HashSet<Cliente> clientes = new HashSet<Cliente>();
	
	public Boolean agregarCliente(Cliente cliente) {
		return this.clientes.add(cliente);
	}
	
	public Integer clientesEnElBar() {
		return this.clientes.size();
	}
	
}
