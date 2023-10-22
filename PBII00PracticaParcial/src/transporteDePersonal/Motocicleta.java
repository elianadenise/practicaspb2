package transporteDePersonal;

public class Motocicleta extends Vehiculo{

	private Persona pasajero;

	public Motocicleta(Double kilometrosRecorridos) {
		super(kilometrosRecorridos);
		this.pasajero = null;
	}

	public Boolean asignarChofer(Persona chofer) {
		if(this.pasajero == null && chofer.getEsChofer()) {
			this.chofer = chofer;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Boolean agregarPasajero(Persona pasajero) {
		if(this.pasajero == null && this.chofer != null && !pasajero.getEsChofer()) {
			this.pasajero = pasajero;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Boolean cambiarChofer(Persona chofer) {
		if(this.pasajero == null && this.chofer != null && chofer.getEsChofer()) {
			this.chofer = chofer;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	
	
}
