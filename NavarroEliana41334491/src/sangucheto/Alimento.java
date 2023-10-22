package sangucheto;

public abstract class Alimento {

	protected String nombre;
	protected Integer cantidadEnStock;
	protected Double precio;
	protected Boolean esCondimento;
	
	public Alimento(String nombre, Double precio) {
		this.nombre = nombre;
		this.cantidadEnStock = 0;
		this.precio = precio;
	}

	public Integer getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(Integer cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getEsCondimento() {
		return esCondimento;
	}
	
	public Integer agregarStock(Integer cantidad) {
		this.setCantidadEnStock(this.getCantidadEnStock() + cantidad);
		return this.getCantidadEnStock();
	}
	
	public Integer eliminarStock() {
		return this.cantidadEnStock = 0;
	}

	public String toString() {
		return this.nombre;
	}
	
	public String alimentosYStock() {
		return this.nombre + ": " + this.cantidadEnStock;
	}
	
	
}
