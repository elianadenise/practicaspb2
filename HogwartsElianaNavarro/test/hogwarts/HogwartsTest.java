package hogwarts;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogwartsTest {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro(){
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();

		libro.agregarHechizo(desarme);

		assertEquals(desarme, libro.buscar("expelliarmus"));
	}
	
	@Test
	public void verSiUnHechizableEstaHechizado(){
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal();
		
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		hechizo.aplicarHechizo(perro);
		
		assertEquals("Me desarmaron", perro.getEstado());
	}
	
	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo =libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}
	
	@Test
	public void queSePuedaAgregarUnHechizoAlLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();

		Boolean agregado = libro.agregarHechizo(desarme);
		Integer cantidadDeHechizos = libro.cantidadDeHechizos();
		Integer esperado = 1;
		
		assertTrue(agregado);
		assertEquals(esperado, cantidadDeHechizos);
	}
	
	@Test
	public void queNoSePuedaAgregarUnHechizoDuplicadoAlLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		Hechizo desarmeDos = new Expelliarmus();

		Boolean agregado = libro.agregarHechizo(desarme);
		Boolean agregadoDos = libro.agregarHechizo(desarmeDos);
		Integer cantidadDeHechizos = libro.cantidadDeHechizos();
		Integer esperado = 1;
		
		assertTrue(agregado);
		assertFalse(agregadoDos);
		assertEquals(esperado, cantidadDeHechizos);
	}
	
	@Test
	public void queSePuedaAgregarMasDeUnHechizoAlLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo hechizo = new Expelliarmus();
		Hechizo hechizoDos = new Agrandar("enormuvus");

		Boolean agregado = libro.agregarHechizo(hechizo);
		Boolean agregadoDos = libro.agregarHechizo(hechizoDos);
		Integer cantidadDeHechizos = libro.cantidadDeHechizos();
		Integer esperado = 2;
		
		assertTrue(agregado);
		assertTrue(agregadoDos);
		assertEquals(esperado, cantidadDeHechizos);
	}
	
	@Test
	public void queUnAnimalSePuedeDefender() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Hechizo("PETRIFICUS TOTALUS");
		Hechizable perro = new Animal();
		
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("PETRIFICUS TOTALUS");
		hechizo.aplicarHechizo(perro);
		
		assertEquals("Me defendí", perro.getEstado());
	}
	
	
	@Test
	public void queSePuedaBuscarUnHechizoEnElLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		
		assertEquals(desarme, hechizo);
	}
	
	@Test
	public void queNoSePuedaSeEncuentreUnHechizoEnElLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		
		Hechizo hechizo = libro.buscar("expelliarmus");
		
		assertNull(hechizo);
	}
	
}
