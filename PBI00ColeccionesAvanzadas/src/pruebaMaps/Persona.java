package pruebaMaps;

import java.util.Objects;

public class Persona{

	private String nombre;
	private Integer edad;
	private Integer dni;
	
	public Persona(String nombre, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	

	
	
	
}
