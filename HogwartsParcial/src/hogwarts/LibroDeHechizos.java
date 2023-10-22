package hogwarts;

import java.util.TreeSet;

public class LibroDeHechizos {
	
	private TreeSet<Hechizo> hechizosAprendidos;
	
	public LibroDeHechizos() {
		this.hechizosAprendidos = new TreeSet<Hechizo>();
	}

	public Boolean agregarHechizo(Hechizo hechizo) {
		return this.hechizosAprendidos.add(hechizo);
		
	}

	public Hechizo buscar(String string) {
		for(Hechizo h : this.hechizosAprendidos) {
			if(h.getNombre().equals(string)) {
				return h;
			}
		}
		throw new RuntimeException("Hechizo no prendido por el Mago");
	}

}
