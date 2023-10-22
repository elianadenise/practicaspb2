package pruebaMaps;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashMapsTest {

	@Test
	public void queSePuedaAgregarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 233443345, 22);
		Persona personaTres = new Persona("Orne", 26545, 20);
		Persona personaCuatro = new Persona("Lucho", 5466775, 22);
		Persona personaCinco = new Persona("Ro", 26545, 22);
		HashMaps hm = new HashMaps();
		
		hm.agregarPersona(persona);
		hm.agregarPersona(personaDos);
		hm.agregarPersona(personaTres);
		hm.agregarPersona(personaCuatro);
		hm.agregarPersona(personaCinco);
		System.out.println(hm.getPersonas());
		assertEquals(new Integer(4), hm.cantidadDePersonas());
	}
	
	@Test
	public void queSePuedaEliminarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 233, 22);
		HashMaps hm = new HashMaps();
		
		hm.agregarPersona(persona);
		hm.agregarPersona(personaDos);
		hm.eliminarPersonaPorDni(233);
		System.out.println(hm.getPersonas());
		assertEquals(new Integer(1), hm.cantidadDePersonas());
	}

}
