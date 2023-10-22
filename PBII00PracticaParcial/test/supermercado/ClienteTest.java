package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void queSePuedaCrearUnCliente() {
		Cliente cliente;
		
		cliente = new Cliente(1, 6);
		
		assertNotNull(cliente);
	}

}
