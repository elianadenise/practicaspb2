package libreriados;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibroTest {

	@Test
	public void queSeCreeCorrectamenteUnLibro() {
		Libro libro = new Libro("El alienista", "Caleb Carr", "1990", "Santillana", 1001, 5085.0, true);
		assertNotNull(libro);
	}
	
	@Test
	public void queSePuedaCalcularPrecioVentaLibroFisico() {
		Libro libro = new Libro("Corriendo", "Ornella", "02/03/2000", "Santillana", 98395, 2800.0, false);
		Double valorEsperado = 3304.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSePuedaCalcularPrecioVentaLibroDigital() {
		Libro libro = new Libro("Corriendo", "Ornella", "02/03/2000", "Santillana", 98395, 2800.0, true);
		Double valorEsperado = 3024.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queNoSePuedaCalcularPrecioVentaLibroDigital() {
		Libro libro = new Libro("Corriendo", "Ornella", "02/03/2000", "Santillana", 98395, 2800.0, false);
		Double valorEsperado = 3024.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertFalse(valorEsperado.equals(valorObtenido));
	}
	
	@Test
	public void queNoSePuedaCalcularPrecioVentaLibroFisico() {
		Libro libro = new Libro("Corriendo", "Ornella", "02/03/2000", "Santillana", 98395, 2800.0, true);
		Double valorEsperado = 3304.0;
		libro.setPrecioVenta();
		Double valorObtenido = libro.getPrecioVenta();
		assertFalse(valorEsperado.equals(valorObtenido));
	}

}
