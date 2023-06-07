package libreria;

import static org.junit.Assert.*;

import org.junit.Test;

public class RevistaTest {
	
	@Test
	public void queSePuedaCrearUnaRevista() {
		// preparacion
		Revista revista;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		// verificacion
		assertNotNull(revista);
	}
	
	@Test
	public void queSePuedaCalcularPrecioDeVentaDeRevistaDigital() {
		// preparacion
		final Double VALOR_ESPERADO = 1120.0;
		final Double VALOR_RESULTADO;
		Revista revista;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		VALOR_RESULTADO = revista.getPrecioVenta();
		// verificacion
		assertEquals(VALOR_ESPERADO, VALOR_RESULTADO);
	}
	
	@Test
	public void queSePuedaCalcularPrecioDeVentaDeRevistaFisica() {
		// preparacion
		final Double VALOR_ESPERADO = 1220.0;
		final Double VALOR_RESULTADO;
		Revista revista;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, false);
		VALOR_RESULTADO = revista.getPrecioVenta();
		// verificacion
		assertEquals(VALOR_ESPERADO, VALOR_RESULTADO);
	}

}
