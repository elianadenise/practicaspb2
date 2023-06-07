package libreria;

import java.util.GregorianCalendar;

public class Revista extends Producto{

	private String nombre;
	private String editor;

	public Revista(String nombre, Integer anio, Integer mes, Integer dia, String editor, Integer codigo, Double costo, Boolean esDigital) {
		super(codigo, costo, esDigital);
		this.nombre = nombre;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
		this.fechaDePublicacion = calendario.getTime();
		this.editor = editor;
		this.setPrecioVenta(costo);
	}
	
	public void setPrecioVenta(Double costo) {
		if(this.esDigital) {
			this.precioVenta = costo + costo * 0.12;
		} else if (!this.esDigital) {
			this.precioVenta = costo + costo * 0.22;
		} else {
			this.precioVenta = 0.0;
		}
	}

}
