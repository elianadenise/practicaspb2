package bibliotecaNacional;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaRnAgregarLibrosALaBiblioteca() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		Boolean seAgregoMatematica = biblioteca.agregarLibro(matematica);
		Boolean seAgregoGeografia = biblioteca.agregarLibro(geografia);
		Boolean seAgregoHistoria = biblioteca.agregarLibro(historia);
		Integer cantidadEsperada = 3;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		
		assertTrue(seAgregoMatematica);
		assertTrue(seAgregoGeografia);
		assertTrue(seAgregoHistoria);
		assertEquals(cantidadEsperada, cantidadObtenida);
	}
	
	@Test
	public void queSePuedaRealizarUnPrestamoAUnEstudiante() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Prestamo prestamo;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334491, "Navarro", "Eliana");
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		prestamo = biblioteca.prestarLibro(estudiante, matematica);
		Integer cantidadEsperada = 2;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		Integer cantidadLibrosEstudiante = estudiante.cantidadDeLibrosEnPrestamo();
		Integer cantidadLibrosEstudianteEsperada = 1;
		assertEquals(cantidadLibrosEstudiante, cantidadLibrosEstudianteEsperada);
		assertEquals(cantidadEsperada, cantidadObtenida);
		assertNotNull(prestamo);
	}
	
	@Test
	public void queNoSePuedaRealizaMasDeDosPrestamosPorEstudiante() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Prestamo prestamo;
		Prestamo prestamoDos;
		Prestamo prestamoTres;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334491, "Navarro", "Eliana");
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		prestamo = biblioteca.prestarLibro(estudiante, matematica);
		prestamoDos = biblioteca.prestarLibro(estudiante, geografia);
		prestamoTres = biblioteca.prestarLibro(estudiante, historia);
		Integer cantidadEsperada = 1;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		
		assertEquals(cantidadEsperada, cantidadObtenida);
		assertNotNull(prestamo);
		assertNotNull(prestamoDos);
		assertNull(prestamoTres);
	}
	
	@Test
	public void queSePuedaDeVolverUnPrestamo() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		Prestamo prestamo;
		
		estudiante = new Estudiante(41334491, "Navarro", "Eliana");
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		biblioteca.prestarLibro(estudiante, matematica);
		prestamo = biblioteca.prestarLibro(estudiante, geografia);
		Boolean seDevolvio = biblioteca.devolverLibro(prestamo);
		Integer cantidadEsperada = 2;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		
		assertEquals(cantidadEsperada, cantidadObtenida);
		assertTrue(seDevolvio);
		
	}
	
	@Test
	public void queElLibroPrestadoNoPuedaPrestarseDosVecesSiNoEsDevuelto() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Prestamo prestamo;
		Prestamo prestamoDos;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334491, "Navarro", "Eliana");
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		prestamo = biblioteca.prestarLibro(estudiante, matematica);
		prestamoDos = biblioteca.prestarLibro(estudiante, matematica);
		Integer cantidadEsperada = 2;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		
		assertEquals(cantidadEsperada, cantidadObtenida);
		assertNotNull(prestamo);
		assertNull(prestamoDos);
	}

	@Test
	public void queSePuedanImprimirLosLibros() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Ada Lovelace");
		geografia = new Geografia(2, "Geografia", "Cristoforo Colombo");
		historia = new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadEsperada = 3;
		Integer cantidadObtenida = biblioteca.cantidadLibrosDisponibles();
		String matematicaImpresion = "Matematica de Ada Lovelace. Prohibida su fotocopia.";
		String geografiaImpresion = "Geografia de Cristoforo Colombo";
		String historiaImpresion = "Historia argentina de Domingo Sarmiento";
		String matematicaObtenido = biblioteca.imprimir(matematica);
		String geografiaObtenido = biblioteca.imprimir(geografia);
		String historiaObtenido = biblioteca.imprimir(historia);
		
		assertEquals(matematicaImpresion, matematicaObtenido);
		assertEquals(geografiaImpresion, geografiaObtenido);
		assertEquals(historiaImpresion, historiaObtenido);
		
		assertEquals(cantidadEsperada, cantidadObtenida);
	}
	
}
