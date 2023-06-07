package libreria;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibreriaTest {

	@Test
	public void queSePuedaCrearUnLibreria() {
		// preparacion
		Libreria libreria;
		// ejecucion
		libreria = new Libreria();
		// verificacion
		assertNotNull(libreria);
	}
	
	// agregar
	@Test
	public void queSePuedaAgregarUnLibroAlCarrito() {
		// preparacion
		Libreria libreria;
		Libro libro;
		final Integer RESULTADO_ESPERADO = 1;
		// ejecucion
		libreria = new Libreria();
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1001, 1500.0, true);
		Boolean resultado = libreria.agregarProducto(libro);
		Integer cantidadProductosEnCarrito = libreria.getCantidadProductosEnCarrito();
		// verificacion
		assertTrue(resultado);
		assertEquals(RESULTADO_ESPERADO, cantidadProductosEnCarrito);
	}
	@Test
	public void queSePuedaAgregarUnaRevistaAlCarrito() {
		// preparacion
		Libreria libreria;
		final Integer RESULTADO_ESPERADO = 1;
		Revista revista;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		libreria = new Libreria();
		Boolean resultado = libreria.agregarProducto(revista);
		Integer cantidadProductosEnCarrito = libreria.getCantidadProductosEnCarrito();
		// verificacion
		assertTrue(resultado);
		assertEquals(RESULTADO_ESPERADO, cantidadProductosEnCarrito);
	}
	@Test
	public void queSePuedaAgregarVariosProductosAlCarrito() {
		// preparacion
		Libreria libreria;
		final Integer RESULTADO_ESPERADO = 4;
		Revista revista;
		Revista revistaDos;
		Libro libro;
		Libro libroDos;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		revistaDos = new Revista ("Pronto",1994, 03, 01, "La Nacion", 1003, 1400.0, false);
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1004, 1500.0, true);
		libroDos = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1005, 2000.0, false);
		libreria = new Libreria();
		Boolean resultadoUno = libreria.agregarProducto(revista);
		Boolean resultadoDos = libreria.agregarProducto(revistaDos);
		Boolean resultadoTres = libreria.agregarProducto(libro);
		Boolean resultadoCuatro = libreria.agregarProducto(libroDos);
		Integer cantidadProductosEnCarrito = libreria.getCantidadProductosEnCarrito();
		// verificacion
		assertTrue(resultadoUno);
		assertTrue(resultadoDos);
		assertTrue(resultadoTres);
		assertTrue(resultadoCuatro);
		assertEquals(RESULTADO_ESPERADO, cantidadProductosEnCarrito);
	}
		
	// eliminar
	@Test
	public void queSePuedaEliminarUnProductoSegunCodigo() {
		// preparacion
		Libreria libreria;
		final Integer RESULTADO_ESPERADO = 3;
		final Integer CODIGO = 1004;
		Revista revista;
		Revista revistaDos;
		Libro libro;
		Libro libroDos;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		revistaDos = new Revista ("Pronto",1994, 03, 01, "La Nacion", 1003, 1400.0, false);
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", CODIGO, 1500.0, true);
		libroDos = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1005, 2000.0, false);
		libreria = new Libreria();
		libreria.agregarProducto(revista);
		libreria.agregarProducto(revistaDos);
		libreria.agregarProducto(libro);
		libreria.agregarProducto(libroDos);
		Boolean resultado = libreria.eliminarPorCodigo(CODIGO);
		Integer cantidadProductosEnCarrito = libreria.getCantidadProductosEnCarrito();
		// verificacion
		assertTrue(resultado);
		assertEquals(RESULTADO_ESPERADO, cantidadProductosEnCarrito);
	}
	
	// calcular total
	public void queSePuedaCalcularElPrecioTotalDelCarrito() {
		// preparacion
		Libreria libreria;
		Revista revista;
		Revista revistaDos;
		Libro libro;
		Libro libroDos;
		// ejecucion
		revista = new Revista ("Billiken",1994, 03, 01, "La Nacion", 1002, 1000.0, true);
		revistaDos = new Revista ("Pronto",1994, 03, 01, "La Nacion", 1003, 1400.0, false);
		libro = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1004, 1500.0, true);
		libroDos = new Libro ("El Alienista", "Caleb Carr", 1994, 03, 15, "Random House", 1005, 2000.0, false);
		libreria = new Libreria();
		final Double VALOR_ESPERADO = revista.getPrecioVenta() + revistaDos.getPrecioVenta() + libro.getPrecioVenta() + libroDos.getPrecioVenta();
		libreria.agregarProducto(revista);
		libreria.agregarProducto(revistaDos);
		libreria.agregarProducto(libro);
		libreria.agregarProducto(libroDos);
		final Double VALOR_TOTAL = libreria.getPrecioTotal();
		// verificacion
		assertEquals(VALOR_ESPERADO, VALOR_TOTAL, 0.01);
	
	}
	
}
