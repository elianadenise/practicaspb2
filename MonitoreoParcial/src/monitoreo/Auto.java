package monitoreo;

public class Auto extends MedioTransporte implements Motorizable{

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	

}
