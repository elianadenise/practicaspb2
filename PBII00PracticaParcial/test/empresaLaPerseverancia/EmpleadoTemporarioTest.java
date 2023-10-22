package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTemporarioTest {

	@Test
	public void queSePuedaCrearUnEmpleadoPermanente() {
		EmpleadoTemporario temporario;
		Integer horasTrabajadas;
		Integer cantidadDeHijos;
		Boolean esCasado;
		
		horasTrabajadas = 80;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 2;
		temporario = new EmpleadoTemporario(horasTrabajadas, esCasado, cantidadDeHijos);
		
		assertNotNull(temporario);
	}
	
	@Test
	public void queSePuedaCalcularSueldo() {
		EmpleadoTemporario temporario;
		Integer horasTrabajadas;
		Integer cantidadDeHijos;
		Boolean esCasado;
		Double resultadoObtenido;
		Double resultadoEsperado;
		
		horasTrabajadas = 80;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 0;
		temporario = new EmpleadoTemporario(horasTrabajadas, esCasado, cantidadDeHijos);
		resultadoObtenido = temporario.calcularSueldo();
		resultadoEsperado = 16_100.0;
		
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

}
