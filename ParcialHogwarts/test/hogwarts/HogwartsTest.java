package hogwarts;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogwartsTest {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() throws HechizoNoEncontrado {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado() throws HechizoNoEncontrado {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		hechizo.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() throws HechizoNoEncontrado {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}
	
	@Test
	public void queNoSePuedaEncontrarUnHechizo() {
		LibroDeHechizos libro = new LibroDeHechizos();
		
		try {
			libro.buscar("expelliarmus");
		} catch (HechizoNoEncontrado e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test (expected = HechizoNoEncontrado.class)
	public void queNoSePuedaEncontrarHechizo() throws HechizoNoEncontrado {
		LibroDeHechizos libro = new LibroDeHechizos();
		libro.buscar("expelliarmus");
	}
	
	@Test
	public void queSePuedaEncontrarHechizo() throws HechizoNoEncontrado {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		libro.agregarHechizo(crecer);
		assertNotNull(libro.buscar("enormuvus"));
	}
}
