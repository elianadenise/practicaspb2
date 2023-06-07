package fechas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FechasTest {

	@Test
	public void queDosFehcasSeanIdenticas() {
		Fecha f1 = new Fecha(2023,5,2);
		Fecha f2 = f1;
		assertEquals(f1,f2); //verde
	}
	@Test
	public void queDosFechasSeanIguales() {
		Fecha f1 = new Fecha(2023,5,2);
		Fecha f2 = new Fecha(2023,5,2);
		Boolean valorObtenido = f1.equals(f2);
		assertTrue(valorObtenido); //rojo 
		//assertEquals(f1,f2); //rojo
		// para que no de rojo hay que hacer el hashcode en clase con el source
	}

}
