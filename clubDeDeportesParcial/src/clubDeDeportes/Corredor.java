package clubDeDeportes;

import interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer distanciaPreferida;
	private Integer cantidadDeKmEntrenados;

	public Corredor(Integer codigo, String nombre, Integer distanciaPreferida) {
		super(codigo, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKmEntrenados = 0;
	}

	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKmEntrenados = km;
		
	}

	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKmEntrenados;
	}



	

}
