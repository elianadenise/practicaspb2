package transporte;

import java.util.ArrayList;
import java.util.HashSet;

public class Camion extends Transporte{	
	
	public Boolean agregar(Paquete paquete, String destino) {
		paquetes.add(paquete); // esto no esta bien y me niego a aceptar otra cosa.
		if(this.sumatoriaVolumen() <= 20.0 && this.sumatoriaPeso() <= 1600.0) {
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
