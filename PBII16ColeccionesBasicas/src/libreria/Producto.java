package libreria;

import java.util.Date;

public abstract class Producto {

	protected Date fechaDePublicacion;
	protected Integer codigo;
	protected Boolean esDigital;
	protected Double costo;
	protected Double precioVenta;
	
	public Producto(Integer codigo, Double costo, Boolean esDigital) {
		this.codigo = codigo;
		this.costo = costo;
		this.esDigital = esDigital;
	}
	
	public abstract void setPrecioVenta(Double costo);
	
	public Double getPrecioVenta() {
		return this.precioVenta;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
}
