package hogwarts;

public class Hechizo implements Comparable<Hechizo>{
	
	protected String nombre;
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}

	public void aplicarHechizo(Hechizable hechizable) {
		if(this instanceof Expelliarmus) {
			hechizable.desarmar();
		} else if(this instanceof Agrandar) {
			hechizable.agrandar();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Hechizo o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

	
}
