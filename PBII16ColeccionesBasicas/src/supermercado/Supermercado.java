package supermercado;

public class Supermercado {

	private Cola a;
	private Cola b;
	
	public Supermercado() {
		this.a = new Cola();
		this.b = new Cola();
	}
	
	public void cambioDeCola() {
		for(Cliente cliente: this.a.getClientes()) {
			if(cliente.getCantidadDeProductos() > 5) {
				b.agregarClienteACola(cliente);
				a.eliminarCliente(cliente);
			}
		}
	}

	public Cola getA() {
		return a;
	}

	public Cola getB() {
		return b;
	}
	
}
