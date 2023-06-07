package banco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void queSePuedaDpositar() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		Boolean valorEsperado = cuenta.depositar(4_000.00); // asi se escribe miles (?)
		
		assertTrue(valorEsperado);
	}
	
	@Test
	public void queSePuedaObtenerSaldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		cuenta.depositar(4_000.00); // asi se escribe miles (?)
		
		Double valorEsperado = cuenta.getSaldo();
		assertEquals(valorEsperado, 4_000.00, 0.01);
	}

}
