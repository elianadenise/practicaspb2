package clubDeDeportes;

import enumeradores.TipoDeBicicleta;
import interfaces.ICiclista;
import interfaces.ICorredor;
import interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private Integer distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	private Integer cantidadDeKilomentrosEntrenados;

	public Triatleta(Integer codigo, String nombre, Integer distanciaPreferida, TipoDeBicicleta tipo) {
		super(codigo, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipo;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return this.distanciaPreferida;
	}

	public TipoDeBicicleta  getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipoDeBicicleta;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		this.cantidadDeKilomentrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return this.cantidadDeKilomentrosEntrenados;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return null;
	}

}
