package libreria;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Producto {

	// atributos
	private Date fechaDePublicacion;
	private static Integer emisorCodigo = 0;
	private Integer codigo;
	private Double costo;
	private Double precioVenta;
	private Boolean esDigital;
	
	// constructor
	public Producto(Integer anio, Integer mes, Integer dia, Double costo, Boolean esDigital) {
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
		this.fechaDePublicacion = calendario.getTime();
		this.codigo = Producto.emisorCodigo++;
		this.costo = costo;
		this.esDigital = esDigital;
		this.setPrecioVenta(costo);
	}
	
	// gets&sets
	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Boolean getEsDigital() {
		return esDigital;
	}

	public void setEsDigital(Boolean esDigital) {
		this.esDigital = esDigital;
	}
	
}
