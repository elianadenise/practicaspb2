package colecciones;
import java.util.*;

public class Linkedlists {

	/* 
	 * Diferencia entre ArrayLists y LinkedList
	 * - eficiencia: arraylist coloca los datos en posiciones adyacentes de la memoria. 
	 * Si se elimina uno, ese lugar queda vacio y no es llenado automaticamente con los posteriores. 
	 * Linkedlist es diferente. Almacena los datos en nodos. Enlace-dato-enlace es un nodo.
	 * Cada nodo, enlaza con el siguiente. Si se elimina un nodo, debemos actualizar los enlaces de los nodos.
	 * Eliminar en linkedlist es menos costoso que un arraylist.
	 * Si vas a estar eliminando cosas, es preferible un LinkedList.
	 * 
	 * Si agregas un elemento nuevo, por defecto se agrega al final. .add(elemento) 
	 * Se puede agregar en una posicion .add(int index, elemento)
	 * 
	 * .remove() elimina le primer elemento.
	 * .remove(int index) segun posicion.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Eliana");
		personas.add("Lara");
		personas.add("Milucha");
		personas.add("Maximiliano");
		
		System.out.println(personas.size());
		
		personas.add(2, "Rosana"); // si lo ponemos en un index que no es el siguiente, da error.
		// si agrego en posicion que ya yiene asignado, se agrega en esa posicion y el ya asignado pasa a ser el siguiente.
		
		ListIterator<String> it = personas.listIterator();
		it.next(); // iterador se encuentra al inicio, si ponemos next, va a estar entre 0 y 1
		it.add("Lola"); // entre Eliana y Lara. 0 eliana 1 lola 2 lara 3 rosana
		
		personas.remove(3); // elimina a rosana
		
		for(String p : personas) {
			System.out.println(p);
		}
		
		
		
	}
	
	
}
