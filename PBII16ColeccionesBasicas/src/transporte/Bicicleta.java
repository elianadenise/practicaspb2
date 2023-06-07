package transporte;

import java.util.ArrayList;

public class Bicicleta extends Transporte{
	
	private String destino;
	
	public Boolean agregar(Paquete paquete, String ciudad) {
		if(this.destino == null) {
			this.destino = ciudad;
		}
		if(this.paquetes.size()<2 &&
				paquete.getVolumen() <= 0.125 &&
				paquete.getPeso() <= 15.0 &&
				this.destino.equals(ciudad)) {
		 paquetes.add(paquete);
		 return true;
		}
		return false;
	}

	public Integer getCantidadDePaquetes() {
		return this.paquetes.size();
	}
	
}
