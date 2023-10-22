package bibliotecaNacional;

public abstract class Libro {

	protected Integer codigo;
	protected String nombre;
	protected String autor;
	protected Boolean sePuedeImprimir;
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public String imprimir() {
		if(this.sePuedeImprimir) {
			return this.nombre + " de " + this.autor;
		}
		return this.nombre + " de " + this.autor + ". Prohibida su fotocopia.";
	}
}
