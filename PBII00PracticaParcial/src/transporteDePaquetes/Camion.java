package transporteDePaquetes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Camion {
	private final Double VOLUMEN_MAXIMO;
	private final Double PESO_MAXIMO;
	private List<Paquete> paquetes;

	public Camion() {
		this.VOLUMEN_MAXIMO = 20.0;
		this.PESO_MAXIMO = 16000.0;
		this.paquetes = new ArrayList<Paquete>();
	}
	
	public Integer cantidadDePaquetes() {
		return this.paquetes.size();
	}

	public Boolean agregarPaquete(Paquete paquete) {
		if(this.sumatoriaVolumen() < this.VOLUMEN_MAXIMO && 
			this.sumatoriaPeso() < this.PESO_MAXIMO ) {
			return this.paquetes.add(paquete);
		} else {
			return Boolean.FALSE;
		}
		
	}
	
	public Double sumatoriaPeso() {
		Double sumatoria = 0.0;
		for(Paquete p : this.paquetes) {
			sumatoria += p.getPeso();
		}
		return sumatoria;
	}
	
	public Double sumatoriaVolumen() {
		Double sumatoria = 0.0;
		for(Paquete p : this.paquetes) {
			sumatoria += p.getVolumen();
		}
		return sumatoria;
	}
}
