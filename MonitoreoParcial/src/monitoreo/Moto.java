package monitoreo;

public class Moto extends MedioTransporte implements Motorizable{

	private String patente;
	private Integer CANTIDAD_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.CANTIDAD_MAXIMA_DE_PASAJEROS = 2;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public Integer getCantidadMaximaDePasajeros() {
		// TODO Auto-generated method stub
		return this.CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	@Override
	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return this.velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}
}
