package excepcionesJuanma;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class PruebaArchivos {

	/*@Test
	public void test() {
		PrintWriter out = null;
		// ESTO ES MANEJO DE EXCEPCIONES
		try {
			out = new PrintWriter("ArchivoDePrueba.txt");
			out = null;
			out.println("Esto es una prueba");
			// out.close();
		} catch(FileNotFoundException e) {
			System.err.println("Se produjo la excepcion");
			e.printStackTrace(); // en catch dejo registro del error no mas, la notificacion
		} catch(NullPointerException n) { // da bien el test
			System.err.println("Se produjo la excepcion");
			n.printStackTrace(); // este te muestra todo el error en consola
		} catch(Exception d) {
			System.err.println("aca caen todas las excepciones, "
					+ "pues es su clase madre, "
					+ "en caso de que no caigan en las anteriores"
					+ "vamos de especifico a general");
		} finally {
			// esto se ejecuta siempre, por mas que haya o no excepcion
			out.close();
		}		
	}*/
	
	/*@Test
	public void testDos() throws FileNotFoundException {
		PrintWriter out = null;
		out = new PrintWriter("ArchivoDePruebaDos.txt");
		out = null;
		out.println("Otra prueba");
	}*/
	
	// una forma de escribir
	@Test (expected = FileNotFoundException.class)
	public void test() throws FileNotFoundException{
		// algun flujo de ejecucion
		ManejoDeArchivos.loguear("Nuevo evento logueado");
	}
	// otra forma de escribir pero mejor
	@Test // (expected = FileNotFoundException.class) puede tener esto o no
	public void testMejor() {
		// algun flujo de ejecucion
		try {
			ManejoDeArchivos.loguear("Nuevo evento logueado");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	@Test (expected = FileNotFoundException.class)
	public void queSeProduceLaExcepcionFileNotFoundException() throws FileNotFoundException{
		ManejoDeArchivos.loguear("Hola, te estoy testeando");
		// test da verde porque espera la excepcion cuando se pone el THROWS
	}
}
