package cuentabancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaConExcepciones {

	// segun juanma si no tengo un Test(expected), usar try no throws
	// forma buena
	@Test // prueba sin excepcion
	public void queSePuedaExtraerConSaldoSuficiente(){
		// el throws se pone solo ya que usa un metodo que tira excepcion
		CajaDeAhorros caja = new CajaDeAhorros();
		caja.depositar(1000.0);
		try {
			assertTrue(caja.extraer(1000.0));
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// otra forma pero es mejor la de arriba
	@Test // prueba sin excepcion
	public void queSePuedaExtraerConSaldoSuficienteDos() throws SaldoInsuficiente{
		// el throws se pone solo ya que usa un metodo que tira excepcion
		CajaDeAhorros caja = new CajaDeAhorros();
		caja.depositar(1000.0);
		assertTrue(caja.extraer(1000.0));
	}

	@Test (expected = SaldoInsuficiente.class) // cuando espero que si de excepcion
	// si no pongo el expected da rojo
	// si espero una excepcion, no hago el manejo con try, lo hago con throws.
	public void queNoSePuedaExtraerConSaldoInsuficiente() throws SaldoInsuficiente {
		// el throws se pone solo ya que usa un metodo que tira excepcion
		CajaDeAhorros caja = new CajaDeAhorros();
		caja.depositar(1000.0);
		assertFalse(caja.extraer(2000.0));
	}
	
	@Test // espero excepcion en consola
	public void paraVerExcepcionEnConsola() {
		// el throws se pone solo ya que usa un metodo que tira excepcion
		CajaDeAhorros caja = new CajaDeAhorros();
		caja.depositar(1000.0);
		try { // se genera solo, pregunta si en throw o try
			assertFalse(caja.extraer(2000.0)); // no hace falta el assert dentro de un try
			//pues es redundante
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
