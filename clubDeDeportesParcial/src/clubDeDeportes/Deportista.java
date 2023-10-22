package clubDeDeportes;

public abstract class Deportista implements Comparable<Deportista>{

	protected String nombre;
	protected Integer codigo;

	public Deportista(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	@Override
	public int compareTo(Deportista o) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(o.codigo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return codigo;
	}

	public void setNumeroDeSocio(Integer codigo) {
		this.codigo = codigo;
	}
	
	
}
