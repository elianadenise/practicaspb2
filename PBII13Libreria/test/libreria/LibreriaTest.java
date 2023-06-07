package libreria;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibreriaTest {

	// L I B R O
	@Test
	public void queSePuedaInicializarUnLibro() {
		// 1. Preparacion
		String TITULO = "Asesinato en el Orient Express";
		String AUTOR = "Agatha Christie";
		String EDITORIAL = "Planeta";
		Integer ANIO = 1934;
		Integer MES = 01;
		Integer DIA = 01;
		Double COSTO = 2356.00;
		Boolean ES_DIGITAL = false;
		Libro nuevo;
		
		// 2. ejecucion
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		
		// 3. Validacion
		assertNotNull(nuevo);
	}
	
	@Test
	public void queSePuedaEstablecerPrecioVentaAUnLibroFisico() {
		// 1. Preparacion
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = false;
		Libro nuevo;
		final Double RESULTADO_ESPERADO = COSTO + COSTO * 18 / 100;
				
		// 2. ejecucion
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		//nuevo.setPrecioVenta(COSTO);	
		// 3. Validacion
		assertEquals(RESULTADO_ESPERADO, nuevo.getPrecioVenta(), 0.01);
	}
	
	@Test
	public void queSePuedaEstablecerPrecioVentaAUnLibroDigital() {
		// 1. Preparacion
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = true;
		Libro nuevo;
		final Double RESULTADO_ESPERADO = COSTO + COSTO * 8 / 100;
				
		// 2. ejecucion
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		//nuevo.setPrecioVenta(COSTO);	
		// 3. Validacion
		assertEquals(RESULTADO_ESPERADO, nuevo.getPrecioVenta(), 0.01);
	}

	
	// R E V I S T A
	@Test
	public void queSePuedaInicializarUnaRevista() {
		// 1. Preparacion
		final String TITULO = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 200.00;
		final Boolean ES_DIGITAL = false;
		Revista nueva;
		
		// 2. ejecucion
		nueva = new Revista(TITULO, EDITOR, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		
		// 3. Validacion
		assertNotNull(nueva);
	}
	
	@Test
	public void queSePuedaEstablecerPrecioVentaAUnaRevistaFisica() {
		// 1. Preparacion
		final String TITULO = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 200.00;
		final Boolean ES_DIGITAL = false;
		Revista nueva;
		final Double RESULTADO_ESPERADO = COSTO + COSTO * 22 / 100;
				
		// 2. ejecucion
		nueva = new Revista(TITULO, EDITOR, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		//nueva.setPrecioVenta(COSTO);	
		// 3. Validacion
		assertEquals(RESULTADO_ESPERADO, nueva.getPrecioVenta(), 0.01);
	}
	
	@Test
	public void queSePuedaEstablecerPrecioVentaAUnaRevistaDigital() {
		// 1. Preparacion
		final String TITULO = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 200.00;
		final Boolean ES_DIGITAL = true;
		Revista nueva;
		final Double RESULTADO_ESPERADO = COSTO + COSTO * 12 / 100;
				
		// 2. ejecucion
		nueva = new Revista(TITULO, EDITOR, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		//nuevo.setPrecioVenta(COSTO);	
		// 3. Validacion
		assertEquals(RESULTADO_ESPERADO, nueva.getPrecioVenta(), 0.01);
	}
	
	
	// L I B R E R I A
	@Test
	public void queSePuedaInicializarUnaLibreria() {
		Libreria nueva;
		
		nueva = new Libreria("Libreria virtual");
		
		assertNotNull(nueva);
	}
	
	@Test
	public void queSeAgregueUnProductoEnElCarrito() {
		// 1. Preparacion
		Libreria nueva;
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = false;
		final Integer CANTIDAD_ESPERADA = 1;
		Libro nuevo;
		// 2. Ejecucion
		nueva = new Libreria("Libreria virtual");
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		final Boolean RESULTADO = nueva.agregarAlCarrito(nuevo);
		
		// 3. Verificacion
		assertTrue(RESULTADO);
		assertEquals(CANTIDAD_ESPERADA, nueva.getCantidadDeProductos());
	}
	
	@Test
	public void queSeElimineUnProductoDelCarritoPorCodigo() {
		// 1. Preparacion
		Libreria nueva;
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = false;
		final String TITULO2 = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO2 = 1934;
		final Integer MES2 = 01;
		final Integer DIA2 = 01;
		final Double COSTO2 = 200.00;
		final Boolean ES_DIGITAL2 = false;
		Revista nueva2;
		Libro nuevo;
		
		final Integer CODIGO = 2; /* para probar la revista */
		// 2. Ejecucion
		nueva = new Libreria("Libreria virtual");
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		nueva2 = new Revista(TITULO2, EDITOR, ANIO2, MES2, DIA2, COSTO2, ES_DIGITAL2);
		nueva.agregarAlCarrito(nuevo);
		nueva.agregarAlCarrito(nueva2);
		Boolean RESULTADO = nueva.eliminarProductoDelCarrito(CODIGO);
				
		// 3. Verificacion
		assertTrue(RESULTADO);
	}
	
	@Test
	public void queSeEliminenTodosLosProductosDelCarrito() {
		// 1. Preparacion
		Libreria nueva;
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = false;
		final String TITULO2 = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO2 = 1934;
		final Integer MES2 = 01;
		final Integer DIA2 = 01;
		final Double COSTO2 = 200.00;
		final Boolean ES_DIGITAL2 = false;
		Revista nueva2;
		Libro nuevo;
		
		// 2. Ejecucion
		nueva = new Libreria("Libreria virtual");
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		nueva2 = new Revista(TITULO2, EDITOR, ANIO2, MES2, DIA2, COSTO2, ES_DIGITAL2);
		nueva.agregarAlCarrito(nuevo);
		nueva.agregarAlCarrito(nueva2);
		nueva.eliminarTodosLosProductosDelCarrito();
				
		// 3. Verificacion
		for(int i = 0; i < nueva.getCarrito().length-1; i++) {
			assertNull(nueva.getCarrito()[i]);
		}
		
	}
	
	@Test 
	public void verificarElTotalAAbonar() {
		// 1. Preparacion
		Libreria nueva;
		final String TITULO = "Asesinato en el Orient Express";
		final String AUTOR = "Agatha Christie";
		final String EDITORIAL = "Planeta";
		final Integer ANIO = 1934;
		final Integer MES = 01;
		final Integer DIA = 01;
		final Double COSTO = 2356.00;
		final Boolean ES_DIGITAL = false;
		final String TITULO2 = "Billiken";
		final String EDITOR = "Planeta";
		final Integer ANIO2 = 1934;
		final Integer MES2 = 01;
		final Integer DIA2 = 01;
		final Double COSTO2 = 200.00;
		final Boolean ES_DIGITAL2 = false;
		Revista nueva2;
		Libro nuevo;
		
		final Double RESULTADO_ESPERADO;
		// 2. Ejecucion
		nueva = new Libreria("Libreria virtual");
		nuevo = new Libro(TITULO, AUTOR, EDITORIAL, ANIO, MES, DIA, COSTO, ES_DIGITAL);
		nueva2 = new Revista(TITULO2, EDITOR, ANIO2, MES2, DIA2, COSTO2, ES_DIGITAL2);
		nueva.agregarAlCarrito(nuevo);
		nueva.agregarAlCarrito(nueva2);
		RESULTADO_ESPERADO = nuevo.getPrecioVenta() + nueva2.getPrecioVenta();
		final Double TOTAL = nueva.totalAAbonar();
						
		// 3. Verificacion
		assertEquals(RESULTADO_ESPERADO, TOTAL);
	}
	
}
