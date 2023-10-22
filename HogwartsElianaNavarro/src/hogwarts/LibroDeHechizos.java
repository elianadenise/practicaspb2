package hogwarts;

import java.util.TreeSet;

public class LibroDeHechizos {

	private TreeSet<Hechizo> hechizos;
	
	public LibroDeHechizos() {
		this.hechizos = new TreeSet<Hechizo>();
	}
	
	public Boolean agregarHechizo(Hechizo hechizo) {
		return this.hechizos.add(hechizo);
	}

	public Hechizo buscar(String hechizo) {
		for(Hechizo h : this.hechizos) {
			if(hechizo.equals(h.getNombre())) {
				return h;
			}
		}
		return null;
	}

	public Integer cantidadDeHechizos() {
		return this.hechizos.size();
	}
	
}
