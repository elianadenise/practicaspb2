package futsal;

public class Jugador {

	private String nombre;
	private Double precio;
	private Integer edad;
	
	public Jugador(String nombre, Double precio, Integer edad) {
		this.nombre = nombre;
		this.precio = precio;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Integer getEdad() {
		return edad;
	}
}
