package libreria;

import java.util.ArrayList;

public class Libreria {
	
	private ArrayList<Producto> carrito = new ArrayList<Producto>();
	private double precioTotal;
	
	public Libreria() {
		this.precioTotal = 0.0;
	}

	public Boolean agregarProducto(Producto producto) {
		return carrito.add(producto);
	}

	public Integer getCantidadProductosEnCarrito() {
		return carrito.size();
	}

	public Boolean eliminarPorCodigo(Integer codigo) {
		for(Producto p :carrito) {
			if(p.getCodigo().equals(codigo)) {
				return carrito.remove(p);
			}
		}
		return false;
	}

	public Double getPrecioTotal() {
		for(Producto p: carrito) {
			this.precioTotal = this.precioTotal + p.getPrecioVenta();
		}
		return this.precioTotal;
	}
	
}
