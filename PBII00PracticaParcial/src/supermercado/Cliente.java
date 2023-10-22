package supermercado;

public class Cliente {

	private Integer posicion;
	private Integer cantidadDeProductos;

	public Cliente(Integer posicion, Integer cantidadDeProductos) {
		this.posicion = posicion;
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
}
