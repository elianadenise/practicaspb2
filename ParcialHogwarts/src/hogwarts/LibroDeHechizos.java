package hogwarts;

import java.util.*;

public class LibroDeHechizos {

	public Set<Hechizo> hechizos;
	
	public LibroDeHechizos() {
		this.hechizos = new TreeSet<Hechizo>();
	}
	
	public void agregarHechizo(Hechizo hechizo) {
		this.hechizos.add(hechizo);		
	}

	public Hechizo buscar(String nombre) throws HechizoNoEncontrado {
		for(Hechizo h : this.hechizos) {
			if(h.getNombre().equals(nombre)) {
				return h;
			}
		}
		throw new HechizoNoEncontrado("Usted no posee el hechizo " + nombre + ".");
	}

}
