package bibliotecaNacional;
import java.util.*;

public class Biblioteca {

	private List<Libro> disponibles;
	private List<Prestamo> enPrestamo;
	private final Integer CANTIDAD_MAXIMA_DE_LIBROS_EN_PRESTAMO_POR_ESTUDIANTE;
	
	public Biblioteca() {
		this.disponibles = new ArrayList<Libro>();
		this.enPrestamo = new ArrayList<Prestamo>();
		this.CANTIDAD_MAXIMA_DE_LIBROS_EN_PRESTAMO_POR_ESTUDIANTE = 2;
	}
	
	public Boolean agregarLibro(Libro libro) {
		return this.disponibles.add(libro);
	}

	public Integer cantidadLibrosDisponibles() {
		return this.disponibles.size();
	}

	public Prestamo prestarLibro(Estudiante estudiante, Libro libro) {
		Prestamo prestamo = null;
		Integer codigo = 0;
		if(estudiante.cantidadDeLibrosEnPrestamo() < this.CANTIDAD_MAXIMA_DE_LIBROS_EN_PRESTAMO_POR_ESTUDIANTE 
				&& this.disponibles.contains(libro)) {
			prestamo = new Prestamo(codigo++, estudiante, libro);
			estudiante.agregarLibro(libro);
			this.enPrestamo.add(prestamo);
			this.disponibles.remove(libro);
		}
		return prestamo;
	}

	public Boolean devolverLibro(Prestamo prestamo) {
		prestamo.getEstudiante().devolverLibro(prestamo.getLibro());
		this.enPrestamo.remove(prestamo);
		return this.disponibles.add(prestamo.getLibro());
	}

	public String imprimir(Libro libro) {
		if(this.disponibles.contains(libro)) {
			return libro.imprimir();
		}
		return null;
	}
}
