package sangucheto;

import static org.junit.Assert.*;

import org.junit.Test;

public class SanguchetoTest {

	@Test
	public void queSePuedaDarDeAltaAlimentos() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		Boolean altaCondimento = sangucheto.darAltaAlimento(condimento);
		Boolean altaIngrediente = sangucheto.darAltaAlimento(ingrediente);
		
		assertTrue(altaCondimento);
		assertTrue(altaIngrediente);
	}
	
	@Test
	public void queSePuedaAgregarStockAAlimentos() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		Boolean agregarStockCondimento = sangucheto.agregarStock("oregano", 2);
		Boolean agregarStockIngrediente = sangucheto.agregarStock("queso", 2);
		Integer cantidadEsperada = 2;
		Integer cantidadQueso = ingrediente.getCantidadEnStock();
		Integer cantidadOregano = condimento.getCantidadEnStock();
		
		assertTrue(agregarStockCondimento);
		assertTrue(agregarStockIngrediente);
		assertEquals(cantidadEsperada, cantidadQueso);
		assertEquals(cantidadEsperada, cantidadOregano);
	}
	
	@Test
	public void queSePuedaObtenerStockDisponibleAlimentos() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		Integer cantidadQueso = sangucheto.obtenerStockDeAlimento("queso");
		Integer cantidadEsperada = 2;
		Integer cantidadOregano = sangucheto.obtenerStockDeAlimento("oregano");
		
		assertEquals(cantidadEsperada, cantidadQueso);
		assertEquals(cantidadEsperada, cantidadOregano);
	}

	@Test
	public void queSePuedaDeterminarExistenciasDeAlimentos() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		Boolean existenciaOregano = sangucheto.determinarExistenciaAlimento("oregano");
		Boolean existenciaQueso = sangucheto.determinarExistenciaAlimento("queso");
		
		assertTrue(existenciaOregano);
		assertFalse(existenciaQueso);
	}
	
	@Test
	public void queSePuedaComprarAlimento() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		Boolean comprarOregano = sangucheto.comprarAlimento("oregano", 1);
		Boolean comprarQueso = sangucheto.comprarAlimento("queso", 3);
		Integer cantidadQueso = sangucheto.obtenerStockDeAlimento("queso");
		Integer cantidadEsperadaQueso = 2;
		Integer cantidadOregano = sangucheto.obtenerStockDeAlimento("oregano");
		Integer cantidadEsperadaOregano = 1;
		
		assertTrue(comprarOregano);
		assertFalse(comprarQueso);
		assertEquals(cantidadEsperadaOregano, cantidadOregano);
		assertEquals(cantidadEsperadaQueso, cantidadQueso);
	}
	
	@Test
	public void queSePuedaEliminarStockAlimento() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		Boolean eliminarStockOregano = sangucheto.eliminarStockDeAlimento("oregano");
		Boolean eliminarStockQueso = sangucheto.eliminarStockDeAlimento("queso");
		Integer cantidadQueso = sangucheto.obtenerStockDeAlimento("queso");
		Integer cantidadOregano = sangucheto.obtenerStockDeAlimento("oregano");
		Integer cantidadEsperada = 0;
		
		assertTrue(eliminarStockOregano);
		assertTrue(eliminarStockQueso);
		assertEquals(cantidadEsperada, cantidadOregano);
		assertEquals(cantidadEsperada, cantidadQueso);
	}
	
	@Test
	public void queAlimentoNoEsteDisponible() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		Boolean eliminarOregano = sangucheto.eliminarAlimento("oregano");
		Integer cantidadDisponibles = sangucheto.cantidadDisponibles();
		Integer cantidadNo = sangucheto.cantidadNoDisponibles();
		Integer cantidadEsperada = 1;
		
		assertTrue(eliminarOregano);
		assertEquals(cantidadEsperada, cantidadDisponibles);
		assertEquals(cantidadEsperada, cantidadNo);
	}
	
	@Test
	public void queSePuedaListaAlimentos() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		String resultado = sangucheto.listarAlimentoDisponibles();
		String esperado = "oregano, queso, ";
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void queSePuedaConsultarStock() {
		Condimento condimento;
		Ingrediente ingrediente;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarStock("queso", 2);
		String resultado = sangucheto.consultarStockDeTodosLosAlimentos();
		String esperado = "oregano: 2, queso: 2, ";
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void queSePuedaAgregarIngredienteAlSangucheto() {

		Ingrediente ingrediente;
		Sangucheto sangucheto;
		

		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("queso", 2);
		Boolean agregarIng = sangucheto.agregarIngredienteASangucheto(ingrediente);
		Integer esperado = 1;
		Integer resultado = sangucheto.cantiadadIngredientes();
		
		assertEquals(esperado, resultado);
		assertTrue(agregarIng);
	}
	
	@Test
	public void queSePuedaAgregarCondimentoAlSangucheto() {

		Condimento condimento;
		Sangucheto sangucheto;
		

		condimento = new Condimento("oregano", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.agregarStock("queso", 2);
		Boolean agregarIng = sangucheto.agregarCondimentoASangucheto(condimento);
		Integer esperado = 1;
		Integer resultado = sangucheto.cantiadadCondimentos();
		
		assertEquals(esperado, resultado);
		assertTrue(agregarIng);
	}
	
	@Test
	public void queSePuedaListarCOndimentosDelSangucheto() {

		Condimento condimento;
		Sangucheto sangucheto;
		

		condimento = new Condimento("oregano", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(condimento);
		sangucheto.agregarStock("queso", 2);
		sangucheto.agregarCondimentoASangucheto(condimento);
		String resultado = sangucheto.listarCondimentosDelSangucheto();
		String esperado = "oregano";
		assertEquals(esperado, resultado);
	}
	@Test
	public void queSePuedaListarIngredientesDelSangucheto() {

		Ingrediente ingrediente;
		Sangucheto sangucheto;
		

		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.agregarStock("queso", 2);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarIngredienteASangucheto(ingrediente);
		String resultado = sangucheto.listarIngredientesDelSangucheto();
		String esperado = "queso";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void queSePuedaCancelarSangucheto() {

		Ingrediente ingrediente;
		Condimento condimento;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.darAltaAlimento(condimento);
		sangucheto.agregarStock("queso", 2);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarIngredienteASangucheto(ingrediente);
		sangucheto.agregarCondimentoASangucheto(condimento);
		Boolean cancelar = sangucheto.cancelarPedido();
		Integer esperado = 0;
		Integer resultadoIngrediente = sangucheto.cantiadadIngredientes();
		Integer resultadoCondimento = sangucheto.cantiadadCondimentos();
		assertEquals(esperado, resultadoIngrediente);
		assertEquals(esperado, resultadoCondimento);
		assertTrue(cancelar);
	}
	
	
	@Test
	public void queSePuedaConsultarPrecioSangucheto() {

		Ingrediente ingrediente;
		Condimento condimento;
		Sangucheto sangucheto;
		
		condimento = new Condimento("oregano", 10.0);
		ingrediente = new Ingrediente("queso", 10.0);
		sangucheto = new Sangucheto();
		sangucheto.darAltaAlimento(ingrediente);
		sangucheto.darAltaAlimento(condimento);
		sangucheto.agregarStock("queso", 2);
		sangucheto.agregarStock("oregano", 2);
		sangucheto.agregarIngredienteASangucheto(ingrediente);
		sangucheto.agregarCondimentoASangucheto(condimento);
		Double precio = sangucheto.consultarPrecioTotalSangucheto();
		Double esperado = 20.0;
		assertEquals(esperado, precio);
	}
}
