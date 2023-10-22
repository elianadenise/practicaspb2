package sangucheto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlimentoTest {

	@Test
	public void queSePuedaCrearUnCondimento() {
		Condimento condimento;
		String nombre;
		Double precio;
		
		nombre = "oregano";
		precio = 10.0;
		
		condimento = new Condimento(nombre, precio);
		
		assertNotNull(condimento);
	}
	
	@Test
	public void queSePuedaCrearUnIngrediente() {
		Ingrediente ingrediente;
		String nombre;
		Double precio;
		
		nombre = "queso";
		precio = 10.0;
		
		ingrediente = new Ingrediente(nombre, precio);
		
		assertNotNull(ingrediente);
	}

}
