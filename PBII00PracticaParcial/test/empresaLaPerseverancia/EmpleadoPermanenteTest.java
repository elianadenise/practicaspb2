package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoPermanenteTest {

	@Test
	public void queSePuedaCrearUnEmpleadoPermanente() {
		EmpleadoPermanente permanente;
		Integer horasTrabajadas;
		Integer antiguedad;
		Integer cantidadDeHijos;
		Boolean esCasado;
		
		horasTrabajadas = 80;
		antiguedad = 6;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 2;
		permanente = new EmpleadoPermanente(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		
		assertNotNull(permanente);
	}
	
	@Test
	public void queSePuedaCalcularSueldo() {
		EmpleadoPermanente permanente;
		Integer horasTrabajadas;
		Integer antiguedad;
		Integer cantidadDeHijos;
		Boolean esCasado;
		Double resultadoObtenido;
		Double resultadoEsperado;
		
		horasTrabajadas = 80;
		antiguedad = 6;
		esCasado = Boolean.TRUE;
		cantidadDeHijos = 2;
		permanente = new EmpleadoPermanente(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		resultadoObtenido = permanente.calcularSueldo();
		resultadoEsperado = 25_100.0;
		
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

	@Test
	public void queSePuedaCalcularSueldoParaOtroEmpleado() {
		EmpleadoPermanente permanente;
		Integer horasTrabajadas;
		Integer antiguedad;
		Integer cantidadDeHijos;
		Boolean esCasado;
		Double resultadoObtenido;
		Double resultadoEsperado;
		
		horasTrabajadas = 160;
		antiguedad = 4;
		esCasado = Boolean.FALSE;
		cantidadDeHijos = 0;
		permanente = new EmpleadoPermanente(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		resultadoObtenido = permanente.calcularSueldo();
		resultadoEsperado = 48_400.0;
		
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

}
