package futsal;

import static org.junit.Assert.*;

import org.junit.Test;

public class FutsalTest {

	/* Jugador */
	@Test
	public void queSePuedaInicializarUnJugadorConDatos() {
		
		// 1. Preparacion
		final String NOMBRE = "Eliana";
		final Double PRECIO = 2000.00;
		final Integer EDAD = 24;
		Jugador nuevo;
		
		// 2. Ejecucion
		nuevo = new Jugador(NOMBRE, PRECIO, EDAD);
		
		// 3. Verificación
		assertNotNull(nuevo);
	}
	
	
	/* Equipo */
	@Test
	public void queSePuedaInicializarUnEquipo() {
		final String NOMBRE = "River";
		Equipo nuevo;
		
		nuevo = new Equipo(NOMBRE);
		
		assertNotNull(nuevo);
	}
	
	@Test 
	public void queSePuedaAgregarUnJugadorAlEquipo() {
		
		final String NOMBRE = "Eliana";
		final Double PRECIO = 2000.00;
		final Integer EDAD = 24;
		Jugador jugador;
		final String NOMBRE2 = "River";
		Equipo equipo;
		final Integer CANTIDAD_ESPERADA = 1;
		
		jugador = new Jugador(NOMBRE, PRECIO, EDAD);
		equipo = new Equipo(NOMBRE2);
		final Boolean RESULTADO_ESPERADO = equipo.agregarJugador(jugador);
		
		assertTrue(RESULTADO_ESPERADO);
		assertEquals(CANTIDAD_ESPERADA, equipo.getIndiceJugadores());
	}
	
	
	
	
}
