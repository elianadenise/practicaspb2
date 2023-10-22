package hogwarts;

import java.util.Objects;

public class Hechizo implements Comparable<Hechizo>{
	
	protected String nombre;
	
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}

	public void aplicarHechizo(Hechizable hechizable) {
		if(this.nombre.equals("expelliarmus")) {
			hechizable.setEstado("Me desarmaron");
		} else if(this.nombre.equals("enormuvus")) {
			hechizable.setEstado("Ahora soy más grande");
		} else {
			hechizable.setEstado("Me defendí");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Hechizo o) {
		return this.getNombre().compareTo(o.getNombre());
	}
}
