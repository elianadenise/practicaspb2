package supermercado;
import java.util.ArrayList;

public class Cliente {

	private ArrayList<Producto> carrito = new ArrayList<Producto>();

	public ArrayList<Producto> getCarrito() {
		return carrito;
	}
	
	public Integer getCantidadDeProductos() {
		return carrito.size();
	}
	
	public Boolean agregarProducto(Producto producto) {
		return carrito.add(producto);
	}
	

}
