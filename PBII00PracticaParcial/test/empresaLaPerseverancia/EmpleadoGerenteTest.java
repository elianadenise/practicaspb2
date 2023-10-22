package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoGerenteTest {

	@Test
	public void queSePuedaCrearUnEmpleadoPermanente() {
		EmpleadoGerente gerente;
		Integer horasTrabajadas;
		Integer antiguedad;
		Integer cantidadDeHijos;
		Boolean esCasado;
		
		horasTrabajadas = 80;
		antiguedad = 6;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 2;
		gerente = new EmpleadoGerente(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		
		assertNotNull(gerente);
	}
	
	@Test
	public void queSePuedaCalcularSueldo() {
		EmpleadoGerente gerente;
		Integer horasTrabajadas;
		Integer antiguedad;
		Integer cantidadDeHijos;
		Boolean esCasado;
		Double resultadoObtenido;
		Double resultadoEsperado;
		
		horasTrabajadas = 160;
		antiguedad = 10;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 1;
		gerente = new EmpleadoGerente(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		resultadoObtenido = gerente.calcularSueldo();
		resultadoEsperado = 65_800.0;
		
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

}
