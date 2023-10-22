package ar.edu.unlam.pb2.eva03.excepciones;

public class VehiculoIncompatible extends Exception {
	public VehiculoIncompatible() {
		super("Vehiculo Incopatible, no es compatible con el tipo de batalla");
	}
	
	public void printStackTrace() {
		System.err.println("Vehiculo Incopatible, no es compatible con el tipo de batalla");
	}
}
