package libreriados;

public class Libro {

	private String editorial;
	private String autor;
	private String titulo;
	private Boolean esDigital;
	private Integer codigo;
	private Double costo;
	private Double precioVenta;

	public Libro(String titulo, String autor,String lanzamiento, String editorial, Integer codigo, Double costo, Boolean esDigital) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.esDigital = esDigital;
		this.costo = costo;
		this.codigo = codigo;
	}
	
	public void setPrecioVenta() {
		if(this.esDigital) {
			this.precioVenta = (costo + costo * 8 / 100);
		} else if (this.esDigital == false) {
			this.precioVenta = (costo + costo * 18 / 100);
		}
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	
}
