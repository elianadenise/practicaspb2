package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {
	
	protected Double altura;

	public Avion(String codigo, String nombre) {
		super(codigo, nombre);
		this.altura = 0.0;
	}

	public Avion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
