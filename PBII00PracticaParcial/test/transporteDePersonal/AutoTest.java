package transporteDePersonal;

import static org.junit.Assert.*;

import org.junit.Test;

import transporteDePersonal.Auto;
import transporteDePersonal.Persona;

public class AutoTest {

	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		Auto auto;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		
		assertNotNull(auto);
	}
	
	@Test
	public void queSePuedaAsignarChofer() {
		Auto auto;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		Boolean seAsigno = auto.asignarChofer(chofer);
		
		assertTrue(seAsigno);
	}
	
	@Test
	public void queSePuedaAsignarPasajero() {
		Auto auto;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		auto.asignarChofer(chofer);
		Boolean seAgrego = auto.agregarPasajero(pasajero);
		
		assertTrue(seAgrego);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Auto auto;
		Persona chofer;
		Persona choferDos;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		choferDos = new Persona(Boolean.TRUE);
		auto.asignarChofer(chofer);
		Boolean seCambio = auto.cambiarChofer(choferDos);
		
		assertTrue(seCambio);
	}
	
	@Test
	public void queNosePuedaCambiarDeChofer() {
		Auto auto;
		Persona chofer;
		Persona choferDos;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		choferDos = new Persona(Boolean.TRUE);
		auto.asignarChofer(chofer);
		auto.agregarPasajero(pasajero);
		Boolean seCambio = auto.cambiarChofer(choferDos);
		
		assertFalse(seCambio);
	}
	
	@Test
	public void queNoSePuedaAsignarChoferSiEsPasajero() {
		Auto auto;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.FALSE);
		Boolean seAsigno = auto.asignarChofer(chofer);
		
		assertFalse(seAsigno);
	}

	@Test
	public void queNoSePuedaAsignarPasajeroSiEsChofer() {
		Auto auto;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.TRUE);
		auto.asignarChofer(chofer);
		Boolean seAgrego = auto.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedaAsignarPasajeroSiNoSeAsignoChofer() {
		Auto auto;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		pasajero = new Persona(Boolean.FALSE);
		Boolean seAgrego = auto.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedanAsignarMasDe20Pasajero() {
		Auto auto;
		Persona chofer;
		Double kilometrosRecorridos;
		
		Persona persona, persona2, persona3, persona4;
		
		kilometrosRecorridos = 100.0;
		auto = new Auto(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		auto.asignarChofer(chofer);
		persona = new Persona(Boolean.FALSE);
		persona2 = new Persona(Boolean.FALSE);
		persona3 = new Persona(Boolean.FALSE);
		persona4 = new Persona(Boolean.FALSE);
		
		auto.agregarPasajero(persona);
		auto.agregarPasajero(persona2);
		
		Boolean resultado = auto.agregarPasajero(persona3);
		
		Boolean resultadoDos = auto.agregarPasajero(persona4);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
	}

}
