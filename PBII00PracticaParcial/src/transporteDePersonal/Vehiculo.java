package transporteDePersonal;

public abstract class Vehiculo {

	protected Double kilometrosRecorridos;
	protected Persona chofer;
	
	public Vehiculo(Double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		this.chofer = null;
	}
	
	public abstract Boolean asignarChofer(Persona chofer);
	public abstract Boolean agregarPasajero(Persona pasajero);
	public abstract Boolean cambiarChofer(Persona chofer);
}
