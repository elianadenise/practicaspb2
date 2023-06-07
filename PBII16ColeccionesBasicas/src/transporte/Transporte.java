package transporte;

import java.util.ArrayList;

public abstract class Transporte {

	protected ArrayList<Paquete> paquetes = new ArrayList<Paquete>();	
	
	public Double sumatoriaVolumen(){
		Double acumulador = 0.0;
		for(Paquete p :paquetes) {
			acumulador = acumulador + p.getVolumen();
		}
		return acumulador;
	}
	
	public Double sumatoriaPeso() {
		Double acumulador = 0.0;
		for(Paquete p :paquetes) {
			acumulador = acumulador + p.getPeso();
		}
		return acumulador;
	}
	
	public abstract Boolean agregar(Paquete paque, String destino);
	
}
