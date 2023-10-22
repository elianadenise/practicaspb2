package bibliotecaNacional;
import java.util.*;
public class Estudiante {

	private Integer dni;
	private String apellido;
	private String nombre;
	private List<Libro> enPrestamo;
	
	public Estudiante(Integer dni, String apellido, String nombre) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.enPrestamo = new ArrayList<Libro>();
	}
	
	public Integer cantidadDeLibrosEnPrestamo() {
		return this.enPrestamo.size();
	}
	
	public void agregarLibro(Libro libro) {
		this.enPrestamo.add(libro);
	}

	public Boolean devolverLibro(Libro libro) {
		return this.enPrestamo.remove(libro);
	}
}
