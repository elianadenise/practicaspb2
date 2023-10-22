package excepcionesJuanma;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoDeArchivos {
	public static void loguear(String mensaje) throws FileNotFoundException{
		// la siguiente linea daba error hasta que lanzó el flinenotfound
		// y dejo de dar error
			PrintWriter out = new PrintWriter("pruebaDeLogueo.txt");
			throw new FileNotFoundException();
			// out.println(mensaje);
			// out.close();
	}
	
}
