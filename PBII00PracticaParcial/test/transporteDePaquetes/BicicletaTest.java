package transporteDePaquetes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void queSePuedaCrearUnaBicicleta() {
		Bicicleta bicicleta;
		
		bicicleta = new Bicicleta();
		
		assertNotNull(bicicleta);
	}
	
	@Test
	public void queSePuedaAgregarPaqueteEnBicicleta() {
		Bicicleta bicicleta;
		Paquete paquete;
		
		bicicleta = new Bicicleta();
		paquete =  new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		Boolean agregar = bicicleta.agregarPaquete(paquete);
		
		assertTrue(agregar);
	}
	
	@Test
	public void queNoSePuedaAgregarMasDeDosPaquetes() {
		Bicicleta bicicleta;
		Paquete paquete;
		Paquete paqueteDos;
		Paquete paqueteTres;
		
		bicicleta = new Bicicleta();
		paquete =  new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		paqueteDos = new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		paqueteTres = new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		bicicleta.agregarPaquete(paquete);
		bicicleta.agregarPaquete(paqueteDos);
		Boolean resultado = bicicleta.agregarPaquete(paqueteTres);
		
		assertFalse(resultado);
	}

	@Test
	public void queNoSePuedaAgregarPaqueteSiSuperaValoresMaximos() {
		Bicicleta bicicleta;
		Paquete paquete;
		Paquete paqueteDos;
		Paquete paqueteTres;
		
		bicicleta = new Bicicleta();
		paquete =  new Paquete(1.0, 1.0, 1.0, 1.0, "Madero"); // prueba volumen
		paqueteDos = new Paquete(0.1, 0.1, 0.1, 16.0, "Madero"); // prueba peso
		paqueteTres = new Paquete(1.0, 1.0, 1.0, 16.0, "Madero"); // prueba peso y volumen
		Boolean resultado = bicicleta.agregarPaquete(paquete);
		Boolean resultadoDos = bicicleta.agregarPaquete(paqueteDos);
		Boolean resultadoTres = bicicleta.agregarPaquete(paqueteTres);
		
		assertFalse(resultado);
		assertFalse(resultadoDos);
		assertFalse(resultadoTres);
	}
	
	@Test
	public void queNoSePuedaAgregarPaqueteConDestinoDiferente() {
		Bicicleta bicicleta;
		Paquete paquete;
		Paquete paqueteDos;
		
		bicicleta = new Bicicleta();
		paquete =  new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		paqueteDos = new Paquete(0.1, 0.1, 0.1, 1.0, "Tapiales");
		bicicleta.agregarPaquete(paquete);
		Boolean resultado = bicicleta.agregarPaquete(paqueteDos);
		
		assertFalse(resultado);
	}
}
