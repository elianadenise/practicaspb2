package transporteDePersonal;

import static org.junit.Assert.*;

import org.junit.Test;

import transporteDePersonal.Motocicleta;
import transporteDePersonal.Persona;

public class MotocicletaTest {

	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		Motocicleta motocicleta;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		
		assertNotNull(motocicleta);
	}
	
	@Test
	public void queSePuedaAsignarChofer() {
		Motocicleta motocicleta;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		Boolean seAsigno = motocicleta.asignarChofer(chofer);
		
		assertTrue(seAsigno);
	}
	
	@Test
	public void queSePuedaAsignarPasajero() {
		Motocicleta motocicleta;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		motocicleta.asignarChofer(chofer);
		Boolean seAgrego = motocicleta.agregarPasajero(pasajero);
		
		assertTrue(seAgrego);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Motocicleta motocicleta;
		Persona chofer;
		Persona choferDos;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		choferDos = new Persona(Boolean.TRUE);
		motocicleta.asignarChofer(chofer);
		Boolean seCambio = motocicleta.cambiarChofer(choferDos);
		
		assertTrue(seCambio);
	}
	
	@Test
	public void queNosePuedaCambiarDeChofer() {
		Motocicleta motocicleta;
		Persona chofer;
		Persona choferDos;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		choferDos = new Persona(Boolean.TRUE);
		motocicleta.asignarChofer(chofer);
		motocicleta.agregarPasajero(pasajero);
		Boolean seCambio = motocicleta.cambiarChofer(choferDos);
		
		assertFalse(seCambio);
	}
	
	@Test
	public void queNoSePuedaAsignarChoferSiEsPasajero() {
		Motocicleta motocicleta;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.FALSE);
		Boolean seAsigno = motocicleta.asignarChofer(chofer);
		
		assertFalse(seAsigno);
	}

	@Test
	public void queNoSePuedaAsignarPasajeroSiEsChofer() {
		Motocicleta motocicleta;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.TRUE);
		motocicleta.asignarChofer(chofer);
		Boolean seAgrego = motocicleta.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedaAsignarPasajeroSiNoSeAsignoChofer() {
		Motocicleta motocicleta;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		pasajero = new Persona(Boolean.FALSE);
		Boolean seAgrego = motocicleta.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedanAsignarMasDeUnPasajero() {
		Motocicleta motocicleta;
		Persona chofer;
		Persona pasajero;
		Persona pasajeroDos;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		motocicleta = new Motocicleta(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		pasajeroDos = new Persona(Boolean.FALSE);
		motocicleta.asignarChofer(chofer);
		motocicleta.agregarPasajero(pasajero);
		Boolean seAgrego = motocicleta.agregarPasajero(pasajeroDos);
		
		assertFalse(seAgrego);
	}
}
