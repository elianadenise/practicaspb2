package ar.edu.unlam.pb2.eva03;

import java.util.*;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (!convoy.contains(vehiculo)) {
			this.convoy.add(vehiculo);
		}
	}
	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}
	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla nueva = new Batalla(nombre, tipo, latitud, longitud);
		this.batallas.put(nombre, nueva);
	}
	public Batalla getBatalla(String nombre) {
		return this.batallas.get(nombre);
	}
	
	public void presentarBatalla() {
		// TODO Auto-generated method stub
		
	}
	
	public Boolean enviarALaBatalla(String batalla, Integer codigoVehiculo) throws VehiculoInexistente, VehiculoIncompatible {
		Vehiculo vehiculo = null;
		for (Vehiculo v : this.convoy) {
	        if (v.getCodigoI().equals(codigoVehiculo)) {
	            vehiculo = v;
	            break;
	        }
	    }
	    if (vehiculo == null) {
	        throw new VehiculoInexistente();
	    }
		// Batalla buscada = this.batallas.get(batalla);
		Batalla buscada = this.getBatalla(batalla);
		if(this.batallas.get(batalla) != null) {
			if(vehiculo instanceof Volador && buscada.getTipo().equals(TipoDeBatalla.AEREA)) {
				return Boolean.TRUE;
			} else if(vehiculo instanceof Acuatico && buscada.getTipo().equals(TipoDeBatalla.NAVAL)) {
				return Boolean.TRUE;
			} else if(vehiculo instanceof Terrestre && buscada.getTipo().equals(TipoDeBatalla.TERRESTRE)) {
				return Boolean.TRUE;
			} else {
				throw new VehiculoIncompatible();
			}
		}
		return Boolean.FALSE;
	} 

}
