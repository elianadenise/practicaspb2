package cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {

	@Test
	public void queSePuedaDepositarYExtraer() throws CuentaInexistente {
		CuentaBancaria cajaDeAhorros = new CajaDeAhorros(323);
		CuentaBancaria corriente = new CuentaCorriente(233);
		CuentaBancaria sueldo = new CuentaSueldo(111);

		Banco banco = new Banco();
		banco.agregarCuentaAlBanco(cajaDeAhorros);
		banco.agregarCuentaAlBanco(corriente);
		banco.agregarCuentaAlBanco(sueldo);

		Transaccion caDep = new Transaccion(1, cajaDeAhorros, TipoDeTransaccion.DEPOSITO, 500.0);
		Transaccion ccDep = new Transaccion(2, corriente, TipoDeTransaccion.DEPOSITO, 500.0);
		Transaccion csDep = new Transaccion(3, sueldo, TipoDeTransaccion.DEPOSITO, 500.0);
		Transaccion caExt = new Transaccion(4, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 200.0);
		Transaccion ccExt = new Transaccion(5, corriente, TipoDeTransaccion.EXTRACCION, 200.0);
		Transaccion csExt = new Transaccion(6, sueldo, TipoDeTransaccion.EXTRACCION, 200.0);

		banco.registroTransaccion(caDep);
		banco.registroTransaccion(ccDep);
		banco.registroTransaccion(csDep);
		banco.registroTransaccion(caExt);
		banco.registroTransaccion(ccExt);
		banco.registroTransaccion(csExt);

		assertEquals(new Integer(3), banco.cantiadadCuentas());
		assertEquals(new Integer(6), banco.cantidadTransaccion());
		assertEquals(new Double(300.0), cajaDeAhorros.getSaldo());
		assertEquals(new Double(300.0), corriente.getSaldo());
		assertEquals(new Double(300.0), sueldo.getSaldo());
	}

	@Test
	public void queSePuedaExtraerCajaDeAhorros() throws CuentaInexistente {
		CuentaBancaria cajaDeAhorros = new CajaDeAhorros(323);
		Banco banco = new Banco();
		banco.agregarCuentaAlBanco(cajaDeAhorros);
		Transaccion caDep = new Transaccion(1, cajaDeAhorros, TipoDeTransaccion.DEPOSITO, 500.0);
		banco.registroTransaccion(caDep);
		Transaccion caExt1 = new Transaccion(2, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		Transaccion caExt2 = new Transaccion(3, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		Transaccion caExt3 = new Transaccion(4, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		Transaccion caExt4 = new Transaccion(5, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		Transaccion caExt5 = new Transaccion(6, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		Transaccion caExt6 = new Transaccion(7, cajaDeAhorros, TipoDeTransaccion.EXTRACCION, 10.0);
		banco.registroTransaccion(caExt1);
		banco.registroTransaccion(caExt2);
		banco.registroTransaccion(caExt3);
		banco.registroTransaccion(caExt4);
		banco.registroTransaccion(caExt5);
		banco.registroTransaccion(caExt6);

		assertEquals(new Double(434), cajaDeAhorros.getSaldo());

	}

	@Test
	public void queSePuedaExtraerMasDelMontoPorCC() throws CuentaInexistente {
		CuentaCorriente corriente = new CuentaCorriente(233);
		Banco banco = new Banco();
		banco.agregarCuentaAlBanco(corriente);
		Transaccion ccDep = new Transaccion(2, corriente, TipoDeTransaccion.DEPOSITO, 500.0);
		Transaccion ccExt = new Transaccion(5, corriente, TipoDeTransaccion.EXTRACCION, 600.0);
		banco.registroTransaccion(ccDep);
		banco.registroTransaccion(ccExt);
		assertEquals(new Double(0.0), corriente.getSaldo());
		assertEquals(new Double(95.0), corriente.getLimiteAdicional());
	}

	@Test(expected = NoPoseeSaldoDisponible.class)
	public void queNoSePuedaExtraerMasDelMontoPorCC() throws NoPoseeSaldoDisponible {
		CuentaCorriente corriente = new CuentaCorriente(233);
		Banco banco = new Banco();
		banco.agregarCuentaAlBanco(corriente);
		Transaccion ccDep = new Transaccion(2, corriente, TipoDeTransaccion.DEPOSITO, 500.0);
		Transaccion ccExt = new Transaccion(5, corriente, TipoDeTransaccion.EXTRACCION, 800.0);
		try {
			banco.registroTransaccion(ccDep);
		} catch (CuentaInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			banco.registroTransaccion(ccExt);
		} catch (CuentaInexistente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
