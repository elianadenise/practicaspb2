package figurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void test() {
		Circulo circulo = new Circulo(3.0, 5.0, 10.0);
		assertNotNull(circulo);
	}
	@Test 
	public void queSePuedaDesplazar() {
		Circulo circulo = new Circulo(3.0, 5.0, 3.0);
		circulo.desplazar(5.0, 5.0);
		Double x = 8.0;
		Double y = 10.0;
		assertEquals(circulo.getPunto().getX(), x);
		assertEquals(circulo.getPunto().getY(), y);
	}
	@Test
	public void queSePuedaCalcularElArea() {
		Circulo circulo = new Circulo(3.0, 5.0, 10.0);
		Double area = circulo.getArea();
		Double esperado = 314.1592653589793;

		assertEquals(esperado, area);
	}
	
	@Test
	public void queSePuedaCompararIguales() {
		Circulo circulo = new Circulo(3.0, 5.0, 10.0);
		Circulo circuloDos = new Circulo(8.0, 7.0, 10.0);
		Integer esperado = 0;
		Integer resultado = circulo.compareTo(circuloDos);
		assertEquals(esperado, resultado);
	}
	@Test
	public void queSePuedaCompararDiferentes() {
		Circulo circulo = new Circulo(3.0, 5.0, 10.0);
		Circulo circuloDos = new Circulo(8.0, 7.0, 9.0);
		Integer esperado = 1;
		Integer resultado = circulo.compareTo(circuloDos);
		assertEquals(esperado, resultado);
	}

}
