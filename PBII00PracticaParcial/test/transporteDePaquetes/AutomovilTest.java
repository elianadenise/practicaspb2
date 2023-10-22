package transporteDePaquetes;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutomovilTest {

	@Test
	public void test() {
		Automovil automovil;
		
		automovil = new Automovil();
		
		assertNotNull(automovil);
	}
	
	@Test
	public void queSePuedaAgregarPaquete() {
		Automovil automovil;
		Paquete paquete;
		
		automovil = new Automovil();
		paquete =  new Paquete(1.0, 1.0, 1.0, 1.0, "Madero");
		Boolean resultado = automovil.agregarPaquete(paquete);
		
		assertTrue(resultado);
	}
	
	@Test
	public void queNoSePuedanIngresarMasDeTresDestinos() {
		Automovil automovil;
		Paquete paquete;
		Paquete paqueteDos;
		Paquete paqueteTres;
		Paquete paqueteCuatro;
		Paquete paqueteCinco;
		
		automovil = new Automovil();
		paquete =  new Paquete(0.1, 0.1, 0.1, 1.0, "Madero");
		paqueteDos =  new Paquete(0.1, 0.1, 0.1, 1.0, "Tapiales");
		paqueteTres =  new Paquete(0.1, 0.1, 0.1, 1.0, "Tablada");
		paqueteCuatro =  new Paquete(0.1, 0.1, 0.1, 1.0, "Tapiales");
		paqueteCinco =  new Paquete(0.1, 0.1, 0.1, 1.0, "San Justo");
		Boolean resultado = automovil.agregarPaquete(paquete);
		Boolean resultadoDos = automovil.agregarPaquete(paqueteDos);
		Boolean resultadoTres = automovil.agregarPaquete(paqueteTres);
		Boolean resultadoCuatro = automovil.agregarPaquete(paqueteCuatro);
		Boolean resultadoCinco = automovil.agregarPaquete(paqueteCinco);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
		assertTrue(resultadoTres);
		assertTrue(resultadoCuatro);
		assertFalse(resultadoCinco);
		
	}

}
