package transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransporteTest {

	// Bicicleta
	@Test
	public void queSePuedaCargarPaquetePequenio() {
		Bicicleta bici = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bici.agregar(p1,"Moron"));
	}
	
	@Test
	public void queNoSePuedaSuperarElLimiteDePaquetes() {
		Bicicleta bici = new Bicicleta();
		Integer valorEsperado = 2;
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bici.agregar(p1,"Moron"));
		assertTrue(bici.agregar(p2,"Moron"));
		assertFalse(bici.agregar(p3,"Moron"));
		assertEquals(valorEsperado, bici.getCantidadDePaquetes());
	}

	@Test
	public void queNoSePuedaCargarVolumenExcedido() {
		Bicicleta bici = new Bicicleta();
		Paquete p1 = new Paquete(0.51, 0.5, 0.5, 1.0);
		assertFalse(bici.agregar(p1,"Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarPesoExcedido() {
		Bicicleta bici = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 20.0);
		assertFalse(bici.agregar(p1,"Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarMasDeUnDestino() {
		Bicicleta bici = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bici.agregar(p1,"Moron"));
		assertFalse(bici.agregar(p2,"San Justo"));
	}
	
	// Auto
	@Test
	public void queSePuedaCargarPaquetePequenioEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(auto.agregar(p1,"Moron"));
	}
	

	@Test
	public void queNoSePuedaCargarVolumenExcedidoEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(1.0, 1.0, 2.5, 1.0);
		assertFalse(auto.agregar(p1,"Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarPesoExcedidoEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 700.0);
		assertFalse(auto.agregar(p1,"Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarMasDeTresDestinosDistintosEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p4 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p5 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(auto.agregar(p1,"Moron"));
		assertTrue(auto.agregar(p2,"San Justo"));
		assertTrue(auto.agregar(p3,"Haedo"));
		assertFalse(auto.agregar(p4,"Moreno"));
		assertTrue(auto.agregar(p5,"San Justo"));
	}
	
	@Test
	public void queNoSePuedaCargarVolumenExcedidoEnVariosPaqueteEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(1.0, 1.0, 1.5, 1.0);
		Paquete p2 = new Paquete(1.0, 1.0, 1.5, 1.0);
		assertTrue(auto.agregar(p1, "Moron"));
		assertFalse(auto.agregar(p2, "San Justo"));
		Integer a = 1;
		assertEquals(auto.getCantidadDePaquetes(), a);
	}
	
	@Test
	public void queNoSePuedaCargarPesoExcedidoEnVariosPaqueteEnAuto() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(1.0, 1.0, 1.5, 200.0);
		Paquete p2 = new Paquete(1.0, 1.0, 0.5, 400.0);
		assertTrue(auto.agregar(p1, "Moron"));
		assertFalse(auto.agregar(p2, "San Justo"));
	}
	
	// camion
	@Test
	public void queSePuedaCargarPaquetePequenioEnCamion() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(camion.agregar(p1, "Moron"));
	}
	

	@Test
	public void queNoSePuedaCargarVolumenExcedidoEnCamion() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(5.0, 1.0, 4.5, 1.0);
		assertFalse(camion.agregar(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarPesoExcedidoEnCamion() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 17000.0);
		assertFalse(camion.agregar(p1, "Moron"));
	}
	
	@Test
	public void queNoSePuedaCargarVolumenExcedidoEnVariosPaqueteEnCamion() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(1.0, 1.0, 1.5, 1.0);
		Paquete p2 = new Paquete(5.0, 1.0, 4.5, 1.0);
		assertTrue(camion.agregar(p1, "Moron"));
		assertFalse(camion.agregar(p2, "Madero"));
		Integer a = 1;
		assertEquals(camion.getCantidadDePaquetes(), a);
	}
	
	@Test
	public void queNoSePuedaCargarPesoExcedidoEnVariosPaqueteEnCamion() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(1.0, 1.0, 1.0, 200.0);
		Paquete p2 = new Paquete(1.0, 1.0, 1.0, 16400.0);
		assertTrue(camion.agregar(p1, "Moron"));
		assertFalse(camion.agregar(p2, "Madero"));
	}
	
}
