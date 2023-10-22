package ar.edu.unlam.pb2.eva03.excepciones;

public class VehiculoInexistente extends Exception {

	public VehiculoInexistente() {
		super("Vehiculo Inexistente, debe crearlo");
	}
	
	public void printStackTrace() {
		System.err.println("Vehiculo Inexistente, debe crearlo");
	}
}
