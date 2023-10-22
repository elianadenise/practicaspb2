package transporteDePersonal;

import static org.junit.Assert.*;

import org.junit.Test;

import transporteDePersonal.Autobus;
import transporteDePersonal.Persona;

public class AutobusTest {

	@Test
	public void queSePuedaCrearUnaMotocicleta() {
		Autobus autobus;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		
		assertNotNull(autobus);
	}
	
	@Test
	public void queSePuedaAsignarChofer() {
		Autobus autobus;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		Boolean seAsigno = autobus.asignarChofer(chofer);
		
		assertTrue(seAsigno);
	}
	
	@Test
	public void queSePuedaAsignarPasajero() {
		Autobus autobus;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		autobus.asignarChofer(chofer);
		Boolean seAgrego = autobus.agregarPasajero(pasajero);
		
		assertTrue(seAgrego);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Autobus autobus;
		Persona chofer;
		Persona choferDos;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		choferDos = new Persona(Boolean.TRUE);
		autobus.asignarChofer(chofer);
		Boolean seCambio = autobus.cambiarChofer(choferDos);
		
		assertTrue(seCambio);
	}
	
	@Test
	public void queNosePuedaCambiarDeChofer() {
		Autobus autobus;
		Persona chofer;
		Persona choferDos;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.FALSE);
		choferDos = new Persona(Boolean.TRUE);
		autobus.asignarChofer(chofer);
		autobus.agregarPasajero(pasajero);
		Boolean seCambio = autobus.cambiarChofer(choferDos);
		
		assertFalse(seCambio);
	}
	
	@Test
	public void queNoSePuedaAsignarChoferSiEsPasajero() {
		Autobus autobus;
		Persona chofer;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.FALSE);
		Boolean seAsigno = autobus.asignarChofer(chofer);
		
		assertFalse(seAsigno);
	}

	@Test
	public void queNoSePuedaAsignarPasajeroSiEsChofer() {
		Autobus autobus;
		Persona chofer;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		pasajero = new Persona(Boolean.TRUE);
		autobus.asignarChofer(chofer);
		Boolean seAgrego = autobus.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedaAsignarPasajeroSiNoSeAsignoChofer() {
		Autobus autobus;
		Persona pasajero;
		Double kilometrosRecorridos;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		pasajero = new Persona(Boolean.FALSE);
		Boolean seAgrego = autobus.agregarPasajero(pasajero);
		
		assertFalse(seAgrego);
	}
	
	@Test
	public void queNoSePuedanAsignarMasDe20Pasajero() {
		Autobus autobus;
		Persona chofer;
		Double kilometrosRecorridos;
		
		Persona persona, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, 
		persona11, persona12, persona13, persona14, persona15, persona16, persona17, persona18, persona19, persona20, persona21;
		
		kilometrosRecorridos = 100.0;
		autobus = new Autobus(kilometrosRecorridos);
		chofer = new Persona(Boolean.TRUE);
		autobus.asignarChofer(chofer);
		persona = new Persona(Boolean.FALSE);
		persona2 = new Persona(Boolean.FALSE);
		persona3 = new Persona(Boolean.FALSE);
		persona4 = new Persona(Boolean.FALSE);
		persona5 = new Persona(Boolean.FALSE);
		persona6 = new Persona(Boolean.FALSE);
		persona7 = new Persona(Boolean.FALSE);
		persona8 = new Persona(Boolean.FALSE);
		persona9 = new Persona(Boolean.FALSE);
		persona10 = new Persona(Boolean.FALSE);
		persona11 = new Persona(Boolean.FALSE);
		persona12 = new Persona(Boolean.FALSE);
		persona13 = new Persona(Boolean.FALSE);
		persona14 = new Persona(Boolean.FALSE);
		persona15 = new Persona(Boolean.FALSE);
		persona16 = new Persona(Boolean.FALSE);
		persona17 = new Persona(Boolean.FALSE);
		persona18 = new Persona(Boolean.FALSE);
		persona19 = new Persona(Boolean.FALSE);
		persona20 = new Persona(Boolean.FALSE);
		persona21 = new Persona(Boolean.FALSE);
		
		autobus.agregarPasajero(persona);
		autobus.agregarPasajero(persona2);
		autobus.agregarPasajero(persona3);
		autobus.agregarPasajero(persona4);
		autobus.agregarPasajero(persona5);
		autobus.agregarPasajero(persona6);
		autobus.agregarPasajero(persona7);
		autobus.agregarPasajero(persona8);
		autobus.agregarPasajero(persona9);
		autobus.agregarPasajero(persona10);
		autobus.agregarPasajero(persona11);
		autobus.agregarPasajero(persona12);
		autobus.agregarPasajero(persona13);
		autobus.agregarPasajero(persona14);
		autobus.agregarPasajero(persona15);
		autobus.agregarPasajero(persona16);
		autobus.agregarPasajero(persona17);
		autobus.agregarPasajero(persona18);
		autobus.agregarPasajero(persona19);
		
		Integer pruebaPosicion = persona6.getPosicion();
		Integer posicion = 6;
		
		Boolean resultado = autobus.agregarPasajero(persona20);
		
		Boolean resultadoDos = autobus.agregarPasajero(persona21);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
		assertEquals(posicion, pruebaPosicion);
	}

}
