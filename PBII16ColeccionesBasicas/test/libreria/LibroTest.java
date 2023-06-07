package libreria;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void queSePuedaCrearUnLibro() {
		// preparacion
		Libro libro;
		// ejecucion
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1001, 1500.0, true);
		// verificacion
		assertNotNull(libro);
	}
	
	@Test
	public void queSePuedaCalcularPrecioDeVentaDeLibroDigital() {
		// preparacion
		Libro libro;
		final Double VALOR_ESPERADO = 1620.0;
		final Double VALOR_RESULTADO;
		// ejecucion
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1001, 1500.0, true);
		VALOR_RESULTADO = libro.getPrecioVenta();
		// verificacion
		assertEquals(VALOR_ESPERADO, VALOR_RESULTADO);
	}
	
	@Test
	public void queSePuedaCalcularPrecioDeVentaDeLibroFisico() {
		// preparacion
		Libro libro;
		final Double VALOR_ESPERADO = 1770.0;
		final Double VALOR_RESULTADO;
		// ejecucion
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1001, 1500.0, false);
		VALOR_RESULTADO = libro.getPrecioVenta();
		// verificacion
		assertEquals(VALOR_ESPERADO, VALOR_RESULTADO);
	}
	
}
