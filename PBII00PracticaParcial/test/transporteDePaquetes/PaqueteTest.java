package transporteDePaquetes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queSePuedaCrearUnPaquete() {
		Paquete paquete;
		
		paquete = new Paquete(1.0, 1.0, 1.0, 1.0, "Madero");
		
		assertNotNull(paquete);
	}
	
	@Test
	public void queSePuedaCalcularVolumenDeUnPaquete() {
		Paquete paquete;
		
		paquete = new Paquete(1.0, 1.0, 1.0, 1.0, "Madero");
		Double valor = paquete.getVolumen();
		Double valorEsperado = 1.0;
		
		assertEquals(valorEsperado, valor);
	}

}
