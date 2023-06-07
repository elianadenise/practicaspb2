package colecciones;
import java.util.*;
public class LinkedListPaises {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		paises.add("Argentina");
		paises.add("Bolivia");
		paises.add("Brasil");
		paises.add("Paraguay");
		
		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("Buenos Aires");
		capitales.add("La Paz");
		capitales.add("Brasilia");
		capitales.add("Asunción");
		
		ListIterator<String> itPaises = paises.listIterator();
		ListIterator<String> itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) {
				itPaises.next();
			}
			itPaises.add(itCapitales.next());
		}
		System.out.println(paises);
		
		itPaises = paises.listIterator();
		itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		System.out.println(paises);
		
		
	}
}
