package monitoreo;

public class Tren extends MedioTransporte implements Motorizable {

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public Integer getCantidadMaximaDePasajeros() {
		// TODO Auto-generated method stub
		return this.cantidadDePasajerosPorVagon;
	}

	@Override
	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return this.velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		// TODO Auto-generated method stub
		return this.cantidadDeVagones;
	}

}