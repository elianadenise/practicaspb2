package pruebaMaps;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapTest {

	@Test
	public void queSePuedaAgregarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 43345, 22);
		Maps maps = new Maps();
		
		maps.agregarPersona(persona);
		maps.agregarPersona(personaDos);
		System.out.println(maps.getPersonas());
		assertEquals(new Integer(2), maps.cantidadDePersonas());
	}
	
	@Test
	public void queSePuedaEliminarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 233, 22);
		Maps maps = new Maps();
		
		maps.agregarPersona(persona);
		maps.agregarPersona(personaDos);
		maps.eliminarPersonaPorDni(233);
		System.out.println(maps.getPersonas());
		assertEquals(new Integer(1), maps.cantidadDePersonas());
	}

}
