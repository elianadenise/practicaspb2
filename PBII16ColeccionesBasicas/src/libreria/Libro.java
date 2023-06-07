package libreria;

import java.util.GregorianCalendar;

public class Libro extends Producto{

	private String titulo;
	private String autor;
	private String editorial;

	public Libro(String titulo, String autor, Integer anio, Integer mes, Integer dia, String editorial, Integer codigo, Double costo, Boolean esDigital) {
		super(codigo, costo, esDigital);
		this.titulo = titulo;
		this.autor = autor;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
		this.fechaDePublicacion = calendario.getTime();
		this.editorial = editorial;
		this.setPrecioVenta(costo);
	}
	
	public void setPrecioVenta(Double costo) {
		if(this.esDigital) {
			this.precioVenta = costo + costo * 0.08;
		} else if (!this.esDigital) {
			this.precioVenta = costo + costo * 0.18;
		} else {
			this.precioVenta = 0.0;
		}
	}

}
