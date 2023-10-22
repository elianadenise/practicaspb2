package bibliotecaNacional;

public class Prestamo {

	private Integer codigo;
	private Estudiante estudiante;
	private Libro libro;
	
	public Prestamo(Integer codigo, Estudiante estudiante, Libro libro) {
		this.codigo = codigo;
		this.estudiante = estudiante;
		this.libro = libro;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public Libro getLibro() {
		return libro;
	}
	
}
