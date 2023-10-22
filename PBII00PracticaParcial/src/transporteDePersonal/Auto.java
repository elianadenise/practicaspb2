package transporteDePersonal;

import java.util.ArrayList;
import java.util.List;

public class Auto extends Vehiculo{
	
	private List<Persona> pasajeros;
	private final Integer CANTIDAD_MAXIMA_PASAJEROS;

	public Auto(Double kilometrosRecorridos) {
		super(kilometrosRecorridos);
		this.pasajeros = new ArrayList<Persona>();
		this.CANTIDAD_MAXIMA_PASAJEROS = 3;
	}
	
	public Integer cantidadDePasajeros() {
		return this.pasajeros.size();
	}
	
	public Boolean asignarChofer(Persona chofer) {
		if(this.cantidadDePasajeros() == 0 && chofer.getEsChofer()) {
			this.chofer = chofer;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Boolean agregarPasajero(Persona pasajero) {
		if(this.cantidadDePasajeros() <= this.CANTIDAD_MAXIMA_PASAJEROS && this.chofer != null && !pasajero.getEsChofer()) {
			this.pasajeros.add(pasajero);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Boolean cambiarChofer(Persona chofer) {
		if(this.cantidadDePasajeros() == 0 && this.chofer != null && chofer.getEsChofer()) {
			this.chofer = chofer;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
