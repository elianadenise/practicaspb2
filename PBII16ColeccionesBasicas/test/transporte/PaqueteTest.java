package transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queSeObtengaElVolumen() {
		Paquete paquetito = new Paquete(1.0,1.0,1.0,1.0);
		
		assertEquals(1.0, paquetito.getVolumen(),0.01);
	}
	
	@Test
	public void queSeObtengaPeso() {
		Paquete paquetito = new Paquete(1.0,1.0,1.0,1.0);
		
		assertEquals(1.0, paquetito.getPeso(),0.01);
	}

}
