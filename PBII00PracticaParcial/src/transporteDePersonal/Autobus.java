package transporteDePersonal;
import java.util.*;
public class Autobus extends Vehiculo{
	
	private List<Persona> pasajeros;
	private final Integer CANTIDAD_MAXIMA_PASAJEROS;
	private Integer indice;

	public Autobus(Double kilometrosRecorridos) {
		super(kilometrosRecorridos);
		this.pasajeros = new ArrayList<Persona>();
		this.CANTIDAD_MAXIMA_PASAJEROS = 20;
		this.indice = 0;
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
			pasajero.setPosicion(++this.indice);
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
