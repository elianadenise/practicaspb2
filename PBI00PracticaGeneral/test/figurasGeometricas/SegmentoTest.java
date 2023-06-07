package figurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegmentoTest {

	@Test
	public void test() {
		Segmento segmento;
		
		segmento = new Segmento(1.0, 3.0, 5.0, 4.0);
	
		assertNotNull(segmento);
	}
	
	@Test
	public void queSeaParalelaAX() {
		Segmento segmento;
		
		segmento = new Segmento(1.0, 3.0, 5.0, 3.0);
	
		assertTrue(segmento.esParaleloAX());
	}

	@Test
	public void queNoSeaParalelaAX() {
		Segmento segmento;
		
		segmento = new Segmento(1.0, 3.0, 5.0, 4.0);
	
		assertFalse(segmento.esParaleloAX());
	}
	
	@Test
	public void queSeaParalelaAy() {
		Segmento segmento;
		
		segmento = new Segmento(3.0, 1.0, 3.0, 5.0);
	
		assertTrue(segmento.esParaleloAY());
	}

	@Test
	public void queNoSeaParalelaAy() {
		Segmento segmento;
		
		segmento = new Segmento(3.0, 1.0, 4.0, 5.0);
	
		assertFalse(segmento.esParaleloAY());
	}
	
	@Test
	public void queSePuedaCompararDosSegmentosIguales() {
		Segmento segmentoUno;
		Segmento segmentoDos;
		
		segmentoUno = new Segmento(3.0, 1.0, 4.0, 5.0);
		segmentoDos = new Segmento(3.0, 1.0, 4.0, 5.0);
		Integer esperado = 0;
	
		assertEquals(esperado, segmentoUno.compareTo(segmentoDos));
	}
	
	@Test
	public void queSePuedaCompararDosSegmentosDiferentes() {
		Segmento segmentoUno;
		Segmento segmentoDos;
		
		segmentoUno = new Segmento(1.0, 1.0, 4.0, 5.0);
		segmentoDos = new Segmento(3.0, 1.0, 4.0, 5.0);
		Integer esperado = 1;
	
		//assertEquals(segmentoUno.getLongitud(), esperado);
		//assertEquals(segmentoDos.getLongitud(), esperado);
		assertEquals(esperado, segmentoUno.compareTo(segmentoDos));
	}
}
