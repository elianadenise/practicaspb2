package interfaces;
import java.util.*;
public class Aeropuerto {

	private List<Volador> voladores = new LinkedList<Volador>();
	
	public void aparcar(Volador volador) {
		this.voladores.add(volador);
	}
	
	public void ponerAVolar() {
		for(Volador v : voladores) {
			v.despegar();
		}
	}
}
