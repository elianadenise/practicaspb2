package coleccionesAvanzadas;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarTest {
	
	@Test
	public void quePuedaIngresarUnCliente() {
		Cliente cliente = new Cliente("Eliana");
		Bar bar = new Bar();
		
		assertTrue(bar.agregarCliente(cliente));
	}

	@Test
	public void queNoIngresenDosClientesConElMismoNombre() {
		Cliente cliente = new Cliente("Eliana");
		Cliente clienteDos = new Cliente("Eliana"); // AGREGAR HASHCODE Y EQUALS
		// hashcode se usa para colecciones hashset, es el valor que emplea para almacenar los objetos
		// hashcode controla el duplicado del hashset,
		// DOS PERSONAS SERAN IGUALES CUANDO COINCIDE DNI. 
		//por ejemplo, se puede hacer por variable; no es necesario que sea todo igual por ejemplo
		Bar bar = new Bar();
		Boolean agregar = bar.agregarCliente(cliente);
		Boolean agregarDos = bar.agregarCliente(clienteDos);
		Integer cantidad = bar.clientesEnElBar();
		Integer cantidadEsperada = 1;
		
		assertEquals(cantidadEsperada, cantidad);
		assertTrue(agregar);
		assertFalse(agregarDos);
	}

}
