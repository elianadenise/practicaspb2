package colecciones;
import java.util.*;
public class ArrayListEmpleado {
	/*
	 * ArrayList permite crear listas dinamicas, no le tenemos que indicar la cantidad de elementos que va a tener.
	 * */
	public static void main(String[] args) {
		
		ArrayList<String> personas = new ArrayList<String>();
		personas.add("Eliana");
		personas.add("Lara");
		personas.add("Milucha");
		personas.add("Maximiliano");
		
		personas.remove(2); // se reacomoda solo.
		
		System.out.println(personas.size());
		
		// set permite settear un elemento en posicion
		personas.set(2, "Rosana");
		
		// get trae el elemento
		// personas.get(3); no me estaria funcionando
		
		for(String p : personas) {
			System.out.println(p);
		}
	}
}
