package libreria;

public class Revista extends Producto{

	// atributos
	private String nombre;
	private String editor;
		
	// constructor
	public Revista(String nombre, String editor, Integer anio, Integer mes, Integer dia, Double costo, Boolean esDigital) {
		super(anio, mes, dia, costo, esDigital);
		this.nombre = nombre;
		this.editor = editor;
		/*this.setPrecioVenta(costo);*/
	}
	
	// metodo
	@Override
	public void setPrecioVenta(Double costo) {
		if(this.getEsDigital()) {
			super.setPrecioVenta(costo + costo * 12 / 100);
		} else if (this.getEsDigital() == false) {
			super.setPrecioVenta(costo + costo * 22 / 100);
		}
	}
}
