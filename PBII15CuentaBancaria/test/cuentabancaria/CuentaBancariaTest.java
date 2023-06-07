package cuentabancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaBancariaTest {

	// Cuenta sueldo
	@Test
	public void queSePuedaRealizarUnDepositoEnCuentaSueldo() {
		CuentaSueldo nueva;
		final Double MONTO_DEPOSITADO = 2000.00;
		
		nueva = new CuentaSueldo();
		Boolean resultado = nueva.depositar(MONTO_DEPOSITADO);
		
		assertTrue(resultado);
	}
	@Test
	public void queSePuedaRealizarUnaExtraccionExitosaEnCuentaSueldo() {
		CuentaSueldo nueva;
		final Double MONTO_DEPOSITADO = 2000.00;
		final Double MONTO_A_EXTRAER = 1500.00;
		
		nueva = new CuentaSueldo();
		nueva.depositar(MONTO_DEPOSITADO);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		
		assertTrue(resultado);
	}
	@Test
	public void queSePuedaRealizarUnaExtraccionFallidaEnCuentaSueldo() {
		CuentaSueldo nueva;
		final Double MONTO_DEPOSITADO = 2000.00;
		final Double MONTO_A_EXTRAER = 2500.00;
		
		nueva = new CuentaSueldo();
		nueva.depositar(MONTO_DEPOSITADO);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		
		assertFalse(resultado);
	}
	
	// Caja de ahorros
	@Test
	public void queSePuedaRealizarUnaExtraccionExitosaEnCajaDeAhorro() {
		CajaDeAhorros nueva;
		final Double MONTO_DEPOSITADO = 2000.00;
		final Double MONTO_A_EXTRAER = 1500.00;
		
		nueva = new CajaDeAhorros();
		nueva.depositar(MONTO_DEPOSITADO);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		
		assertTrue(resultado);
	}
	@Test
	public void queSePuedaComprobarCobroDelMontoAdicionalPorExtraccionenCajaDeAhorro() {
		CajaDeAhorros cuenta = new CajaDeAhorros();
		cuenta.depositar(4000.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		Double valorObtenido = cuenta.getSaldo();
		
		assertEquals(3934.00, valorObtenido, 0.01);
	}
	@Test
	public void queNoSePuedaExtraerDespuesDeLaQuintaExtracciónSiNoAlcanzaElSaldo() {
		CajaDeAhorros cuenta = new CajaDeAhorros();
		cuenta.depositar(60.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		cuenta.extraer(10.00);
		
		assertFalse(cuenta.extraer(10.0));
		assertEquals(10.0, cuenta.getSaldo(), 0.01);
	}
	
	// Cuenta corriente
	@Test
	public void queSePuedaRealizarUnaExtraccionEnCuentaCorriente() {
		CuentaCorriente nueva;
		final Double MONTO_A_DEPOSITAR = 100.00;
		final Double MONTO_A_EXTRAER = 10.00;
		
		nueva = new CuentaCorriente();
		nueva.depositar(MONTO_A_DEPOSITAR);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		
		assertTrue(resultado);
	}
	@Test 
	public void queSePuedaRealizarUnaExtraccionSuperandoElSaldoPeroSinSuperarElMontoDeGiroAlDescubiertoEnCuentaCorriente() {
		CuentaCorriente nueva;
		final Double MONTO_A_DEPOSITAR = 10.00;
		final Double MONTO_A_EXTRAER = 20.00;
		final Double DEUDA_ESPERADA = 10.5;
		
		nueva = new CuentaCorriente();
		nueva.depositar(MONTO_A_DEPOSITAR);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		Double deuda = nueva.getDeuda();
		
		assertTrue(resultado);
		assertEquals(DEUDA_ESPERADA, deuda, 0.01);
	}
	@Test
	public void queNoSePuedaRealizarUnaExtraccionSuperandoElMontoAExtraerEnCuentaCorriente() {
		CuentaCorriente nueva;
		final Double MONTO_A_DEPOSITAR = 10.00;
		final Double MONTO_A_EXTRAER = 120.00;
		
		nueva = new CuentaCorriente();
		nueva.depositar(MONTO_A_DEPOSITAR);
		Boolean resultado = nueva.extraer(MONTO_A_EXTRAER);
		
		assertFalse(resultado);
	}
	
}
