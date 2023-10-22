package ejercicio;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

	/*
	 * TDD - Test Driven Development
	 * Construir las pruebas antes de desarrollar te obliga a ponerte de acuerdo.
	 * Construir pruebas, probar antes de escribir el código para evitar defectos.
	 * Metodo a metodo, te aseguras que funcione.
	 * Parto del resultado esperado y despues veo como lo logro.
	*/
	
	@Test // annotation (anotación)
	public void queCuandoSumeCincoMasCincoDeDiez() { // metodos descriptivos
		// 1. Preparación Paso 1
		final Integer RESULTADO_ESPERADO = 10, OPERADOR1 = 5, OPERADOR2 = 5;
		Integer resultadoObtenido = 0;
		Calculadora casio = new Calculadora();
		
		// 2. Ejecución Paso 3
		resultadoObtenido = casio.sumar(OPERADOR1, OPERADOR2);
		
		// 3. Contrastación Paso 2
		assertEquals(RESULTADO_ESPERADO, resultadoObtenido);
	}
	@Test
	public void queCuandoSumeCincPuntoCincooMasCincoPuntoCeroDeDiezPuntoCinco() { // metodos descriptivos
		// 1. Preparación Paso 1
		final Double RESULTADO_ESPERADO = 10.5, OPERADOR1 = 5.5, OPERADOR2 = 5.0;
		double resultadoObtenido = 0;
		Calculadora casio = new Calculadora();
		// casio = null; // error
		// 2. Ejecución Paso 3
		resultadoObtenido = casio.sumar(OPERADOR1, OPERADOR2);
		
		// 3. Contrastación Paso 2
		assertEquals(RESULTADO_ESPERADO, resultadoObtenido, 0.01);
		/* si no pongo el DELTA da error y no puedo ejecutar
		 * cuando trabajamos con double o float definir un DELTA (0.01)
		 * esto se debe a los numeros infinitos despues de la coma.
		 * 0.01 serian dos decimales.
		 * con Delta defino la presicion de la comparacion.
		*/
		// error != failures
	}
	@Test
	public void queUnNumeroNegativoSeaConsideradoComoTal() {
		// final Boolean RESULTADO_ESPERADO = true; // al pedo porque el assert ya tiene la condicion
		// 1. Preparcion
		final Integer OPERADOR1 = -5;
		boolean resultadoObtenido;
		Calculadora casio = new Calculadora();
		// 2. Ejecucion
		resultadoObtenido = casio.esNegativo(OPERADOR1);
		// 3. Validacion
		assertTrue(resultadoObtenido);
	}
	

}
