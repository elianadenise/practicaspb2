package bibliotecaNacional;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibrosTest {

	@Test
	public void queSePuedanCrearLosTresLibros() {
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		
		assertNotNull(matematica);
		assertNotNull(geografia);
		assertNotNull(historia);
	}

	@Test
	public void queFuncioneLaImpresionEnHistoriaYGeografia() {
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		String matematicaImpresion = "Matematica de Ada Lovelace. Prohibida su fotocopia.";
		String geografiaImpresion = "Geografia de Cristoforo Colombo";
		String historiaImpresion = "Historia argentina de Domingo Sarmiento";
		String matematicaObtenido = matematica.imprimir();
		String geografiaObtenido = geografia.imprimir();
		String historiaObtenido = historia.imprimir();
		
		assertEquals(matematicaImpresion, matematicaObtenido);
		assertEquals(geografiaImpresion, geografiaObtenido);
		assertEquals(historiaImpresion, historiaObtenido);
		
	}
}
