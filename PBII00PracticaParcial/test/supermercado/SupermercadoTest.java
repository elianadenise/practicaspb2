package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void test() {
		Supermercado supermercado;
		
		supermercado = new Supermercado();
		
		assertNotNull(supermercado);
	}
	
	@Test
	public void queSePuedaAgregarClientesAFilaA() {
		Supermercado supermercado;
		Cliente clienteUno;
		Cliente clienteDos;
		Cliente clienteTres;
		Cliente clienteCuatro;
		Cliente clienteCinco;
		
		supermercado = new Supermercado();
		clienteUno = new Cliente(1, 6);
		clienteDos = new Cliente(2, 3);
		clienteTres = new Cliente(3, 2);
		clienteCuatro = new Cliente(4, 7);
		clienteCinco = new Cliente(5, 5); // este prueba si funciona la condicion
		Boolean resultadoUno = supermercado.agregarClienteAFilaA(clienteUno);
		Boolean resultadoDos = supermercado.agregarClienteAFilaA(clienteDos);
		Boolean resultadoTres = supermercado.agregarClienteAFilaA(clienteTres);
		Boolean resultadoCuatro = supermercado.agregarClienteAFilaA(clienteCuatro);
		Boolean resultadoCinco = supermercado.agregarClienteAFilaA(clienteCinco);
		Integer resultadoFilaA = supermercado.cantidadClientesEnFilaA();
		Integer resultadoEsperado = 5;
		
		assertTrue(resultadoUno);
		assertTrue(resultadoDos);
		assertTrue(resultadoTres);
		assertTrue(resultadoCuatro);
		assertTrue(resultadoCinco);
		assertEquals(resultadoEsperado, resultadoFilaA);
	}

	@Test
	public void queSeAbraFilaBYPasenClientesConMenosDe5Productos() {
		Supermercado supermercado;
		Cliente clienteUno;
		Cliente clienteDos;
		Cliente clienteTres;
		Cliente clienteCuatro;
		Cliente clienteCinco;
		
		supermercado = new Supermercado();
		clienteUno = new Cliente(1, 6);
		clienteDos = new Cliente(2, 3);
		clienteTres = new Cliente(3, 2);
		clienteCuatro = new Cliente(4, 7);
		clienteCinco = new Cliente(5, 5);
		supermercado.agregarClienteAFilaA(clienteUno);
		supermercado.agregarClienteAFilaA(clienteDos);
		supermercado.agregarClienteAFilaA(clienteTres);
		supermercado.agregarClienteAFilaA(clienteCuatro);
		supermercado.agregarClienteAFilaA(clienteCinco);
		supermercado.abrirFilaB();
		Integer resultadoFilaA = supermercado.cantidadClientesEnFilaA();
		Integer resultadoFilaB = supermercado.cantidadClientesEnFilaB();
		Integer resultadoEsperadoFilaA = 3;
		Integer resultadoEsperadoFilaB = 2;
		
		assertEquals(resultadoEsperadoFilaA, resultadoFilaA);
		assertEquals(resultadoEsperadoFilaB, resultadoFilaB);
	}
}
