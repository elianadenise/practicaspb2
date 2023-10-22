package transporteDePaquetes;

public class Paquete {

	private Double ancho;
	private Double alto;
	private Double profundidad;
	private Double peso;
	private Double volumen;
	private String ciudad;

	public Paquete(Double ancho, Double alto, Double profundidad, Double peso, String ciudad) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.peso = peso;
		this.ciudad = ciudad;
		this.setVolumen();
	}

	public void setVolumen() {
		this.volumen = this.profundidad * this.alto * this.ancho;
	}
	
	public Double getVolumen() {
		return this.volumen;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Double getPeso() {
		return peso;
	}
	
}
