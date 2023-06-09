package libreria;

public class Libreria {

	private String nombre;
	private Producto carrito [];
	private final Integer CANTIDAD_MAXIMA;
	private Integer cantidadDeProductos;
	
	public Libreria(String nombre) {
		this.nombre = nombre;
		this.CANTIDAD_MAXIMA = 100;
		this.carrito = new Producto[this.CANTIDAD_MAXIMA];
		this.cantidadDeProductos = 0;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public Boolean agregarAlCarrito(Producto nuevo) {
		// TODO Auto-generated method stub
		carrito[this.cantidadDeProductos++] = nuevo;
		return true;
	}

	public Boolean eliminarProductoDelCarrito(Integer codigo) {
		for(int i = 0; i < carrito.length-1; i++) {
			if(carrito[i] != null && carrito[i].getCodigo().equals(codigo)) {
				carrito[i] = null;
				return true;
			}
		}
		return false;
	}

	public void eliminarTodosLosProductosDelCarrito() {
		for(int i = 0; i < carrito.length-1; i++) {
			if(carrito[i] != null) {
				carrito[i] = null;
			}
		}
	}

	public Producto[] getCarrito() {
		return carrito;
	}

	public Double totalAAbonar() {
		Double total = 0.0;
		for(int i = 0; i < carrito.length-1; i++) {
			if(carrito[i] != null) {
				total = total + carrito[i].getPrecioVenta();
			}
		}
		return total;
	}
	
}
