package figurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void queSePuedaCrearUnPunto() {
		Punto punto;
		punto = new Punto(1.0, 2.0);
		assertNotNull(punto);
	}

	@Test
	public void queSePuedaCalcularDistanciaEntreDosPuntos() {
		Punto uno = new Punto(1.0, 1.0);
		Punto dos = new Punto(2.0, 2.0);
		
		Double distanciaObtenida = uno.distancia(dos);
		Double distanciaEsperada = 1.41;
		
		assertEquals(distanciaEsperada, distanciaObtenida, 0.01);
	}
	
	@Test
	public void queSePuedaDesplazarALaDerecha() {
		Double deltaX = 1.0;
		Double deltaY = 0.0; // para que solo se mueva a la derecha
		Punto punto = new Punto(1.0, 1.0);
		
		punto.desplazar(deltaX, deltaY);
		
		assertEquals(punto.getX(), 2.0, 0.01);
		assertTrue(punto.getX().equals(2.0));
		assertTrue(punto.getY().equals(1.0));
		Punto puntoDos = new Punto(2.0, 1.0);
		
		assertEquals(punto, puntoDos);
	}
	
	
}
