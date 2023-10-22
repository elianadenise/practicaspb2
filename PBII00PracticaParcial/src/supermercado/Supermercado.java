package supermercado;

import java.util.*;

public class Supermercado {

	private List<Cliente> filaA;
	private List<Cliente> filaB;
	private final Integer CANTIDAD_MAXIMA_DE_PRODUCTOS_EN_FILA_B;
	
	public Supermercado() {
		this.filaA = new ArrayList<Cliente>();
		this.filaB = new LinkedList<Cliente>();
		this.CANTIDAD_MAXIMA_DE_PRODUCTOS_EN_FILA_B = 5;
	}

	public Boolean agregarClienteAFilaA(Cliente cliente) {
		return this.filaA.add(cliente);
	}

	public Integer cantidadClientesEnFilaA() {
		return this.filaA.size();
	}
	
	public Integer cantidadClientesEnFilaB() {
		return this.filaB.size();
	}

	public void abrirFilaB() {
		Integer index = 0;
		for(Cliente cliente : this.filaA) {
			if(cliente.getCantidadDeProductos() < this.CANTIDAD_MAXIMA_DE_PRODUCTOS_EN_FILA_B) {
				cliente.setPosicion(index);
				index++;
				this.filaB.add(cliente);
			} else {
				cliente.setPosicion(cliente.getPosicion() - index);
			}
		}
		this.filaA.removeAll(filaB);
	}
}
