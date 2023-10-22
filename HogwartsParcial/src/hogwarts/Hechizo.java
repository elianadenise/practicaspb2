package hogwarts;

public abstract class Hechizo implements Comparable<Hechizo>{

	protected String nombre;
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void aplicarHechizo(Hechizable hechizable);

	@Override
	public int compareTo(Hechizo o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
