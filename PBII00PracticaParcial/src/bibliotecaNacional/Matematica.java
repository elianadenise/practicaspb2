package bibliotecaNacional;

public class Matematica extends Libro{

	public Matematica(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		this.sePuedeImprimir = Boolean.FALSE;
	}
	
}
