package hogwarts;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogwartsTest {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado() {
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
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}
	
	@Test (expected = RuntimeException.class)
	public void queNoSeEncuentreUnHechizo() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}
}
