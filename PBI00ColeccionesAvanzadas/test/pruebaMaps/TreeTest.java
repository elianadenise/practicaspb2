package pruebaMaps;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void queSePuedaAgregarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 233443345, 22);
		TreeSets tree = new TreeSets();
		
		tree.agregarPersona(persona);
		tree.agregarPersona(personaDos);
		System.out.println(tree.getPersonas());
		assertEquals(new Integer(2), tree.cantidadDePersonas());
	}
	
	@Test
	public void queSePuedaEliminarPersona() {
		Persona persona = new Persona("Eliana", 41334491, 25);
		Persona personaDos = new Persona("Andrea", 233, 22);
		TreeSets tree = new TreeSets();
		
		tree.agregarPersona(persona);
		tree.agregarPersona(personaDos);
		tree.eliminarPersonaPorDni(persona);
		System.out.println(tree.getPersonas());
		assertEquals(new Integer(1), tree.cantidadDePersonas());
	}

}
