package transporte;
import java.util.ArrayList;
import java.util.*;

public class Auto extends Transporte{

	private HashSet<String> destino = new HashSet<String>();
	
	
	public Boolean agregar(Paquete paquete, String ciudad) {
		if(this.destino.contains(ciudad) || this.destino.size() < 3
				&& !this.destino.contains(ciudad)) {
			this.destino.add(ciudad);
		} else {
			return false; 
		}
		paquetes.add(paquete); // esto no esta bien y me niego a aceptar otra cosa.
		if(this.sumatoriaVolumen() <= 2.0 && this.sumatoriaPeso() <= 500.0) {
			return true;
		} else {
			paquetes.remove(paquete);
			return false;
		}

	}

	public Integer getCantidadDePaquetes() {
		return this.paquetes.size();
	}
	
	
}
