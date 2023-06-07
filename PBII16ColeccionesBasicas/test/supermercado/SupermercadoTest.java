package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void queSePuedaCambiarDeFila() {
		Supermercado supermercado = new Supermercado();
		Producto producto = new Producto(1, "arroz");
		Producto producto2 = new Producto(2, "arroz");
		Producto producto3 = new Producto(3, "arroz");
		Producto producto4 = new Producto(4, "arroz");
		Producto producto5 = new Producto(5, "arroz");
		Producto producto6 = new Producto(6, "arroz");
		Producto producto7 = new Producto(7, "arroz");
		Producto producto8 = new Producto(8, "arroz");
		Producto producto9 = new Producto(9, "arroz");
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		cliente.agregarProducto(producto);
		cliente.agregarProducto(producto2);
		cliente.agregarProducto(producto3);
		cliente.agregarProducto(producto4);
		cliente.agregarProducto(producto5);
		cliente.agregarProducto(producto6);
		cliente2.agregarProducto(producto4);
		cliente2.agregarProducto(producto5);
		cliente3.agregarProducto(producto6);
		supermercado.getA().agregarClienteACola(cliente);
		supermercado.getA().agregarClienteACola(cliente2);
		supermercado.getA().agregarClienteACola(cliente3);
		supermercado.cambioDeCola();
		Integer valor_a = 2;
		Integer valor_b = 1;
		
		assertEquals(valor_a, supermercado.getA().getCantidadDeClientes());
		assertEquals(valor_b, supermercado.getB().getCantidadDeClientes());
	}

}
