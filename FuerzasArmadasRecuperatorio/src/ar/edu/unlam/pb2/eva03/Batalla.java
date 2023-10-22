package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	
	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.nombre = nombre;
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		// TODO Auto-generated method stub
		return this.latitud;
	}

	public Double getLongitud() {
		// TODO Auto-generated method stub
		return this.longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}
	
	
}