package libreria;

public class Libro extends Producto{

	// atributos
	private String titulo;
	private String autor;
	private String editorial;
	
	// constructor
	public Libro(String titulo, String autor, String editorial, Integer anio, Integer mes, Integer dia, Double costo, Boolean esDigital) {
		super(anio, mes, dia, costo, esDigital);
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		/*this.setPrecioVenta(costo);*/
		//funciona igual, segun el test
	}

	// metodos
	@Override
	public void setPrecioVenta(Double costo) {
		if(this.getEsDigital()) {
			super.setPrecioVenta(costo + costo * 8 / 100);
		} else if (this.getEsDigital() == false) {
			super.setPrecioVenta(costo + costo * 18 / 100);
		}
	}
	
	
	
	
	
}
