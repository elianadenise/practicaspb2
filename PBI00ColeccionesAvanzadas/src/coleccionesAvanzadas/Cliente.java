package coleccionesAvanzadas;

import java.util.Objects;

public class Cliente extends Object implements Comparable<Cliente>{
	
	private String nombre;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}

	@Override // cuando ponemos implements Comparable<Cliente> lo agrega solo
	public int compareTo(Cliente o) { // pero hay que escribir el resto de codigo
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
