package figurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void test() {
		Cuadrado cuadrado = new Cuadrado(3.0, 5.0, 10.0);
		assertNotNull(cuadrado);
	}
	@Test 
	public void queSePuedaDesplazar() {
		Cuadrado cuadrado = new Cuadrado(3.0, 5.0, 10.0);
		cuadrado.desplazar(5.0, 5.0);
		Double x = 8.0;
		Double y = 10.0;
		assertEquals(cuadrado.getPunto().getX(), x);
		assertEquals(cuadrado.getPunto().getY(), y);
	}
	@Test
	public void queSePuedaCalcularElArea() {
		Cuadrado cuadrado = new Cuadrado(3.0, 5.0, 10.0);
		Double area = cuadrado.getArea();
		Double esperado = 100.0;
		
		assertEquals(esperado, area);
	}
	
	@Test
	public void queSePuedaCompararIguales() {
		Cuadrado cuadrado = new Cuadrado(3.0, 5.0, 10.0);
		Cuadrado cuadradoDos = new Cuadrado(8.0, 7.0, 10.0);
		Integer esperado = 0;
		Integer resultado = cuadrado.compareTo(cuadradoDos);
		assertEquals(esperado, resultado);
	}
	@Test
	public void queSePuedaCompararDiferentes() {
		Cuadrado cuadrado = new Cuadrado(3.0, 5.0, 10.0);
		Cuadrado cuadradoDos = new Cuadrado(8.0, 7.0, 9.0);
		Integer esperado = 1;
		Integer resultado = cuadrado.compareTo(cuadradoDos);
		assertEquals(esperado, resultado);
	}
}
