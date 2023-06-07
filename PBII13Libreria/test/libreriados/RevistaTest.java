package libreriados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RevistaTest {

	@Test
	public void queSeCreeCorrectamenteUnLibro() {
		Revista revista = new Revista("Pronto", "1990", "Santillana", 1001, 1200.0, true);
		assertNotNull(revista);
	}
	
	@Test
	public void queSePuedaCalcularPrecioVentaLibroFisico() {
		Revista revista = new Revista("Pronto", "1990", "Santillana", 1001, 1200.0, true);
		Double valorEsperado = 3304.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSePuedaCalcularPrecioVentaLibroDigital() {
		Revista revista = new Revista("Pronto", "1990", "Santillana", 1001, 1200.0, true);
		Double valorEsperado = 3024.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queNoSePuedaCalcularPrecioVentaLibroDigital() {
		Revista revista = new Revista("Pronto", "1990", "Santillana", 1001, 1200.0, true);
		Double valorEsperado = 3024.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertFalse(valorEsperado.equals(valorObtenido));
	}
	
	@Test
	public void queNoSePuedaCalcularPrecioVentaLibroFisico() {
		Revista revista = new Revista("Pronto", "1990", "Santillana", 1001, 1200.0, true);
		Double valorEsperado = 3304.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertFalse(valorEsperado.equals(valorObtenido));
	}

	
}
