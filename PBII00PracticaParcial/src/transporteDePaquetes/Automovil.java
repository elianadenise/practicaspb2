package transporteDePaquetes;

import java.util.*;

public class Automovil {

	private final Double VOLUMEN_MAXIMO;
	private final Double PESO_MAXIMO;
	private List<Paquete> paquetes;
	private HashSet<String> destinos;
	private Integer CANTIDAD_MAXIMA_DESTINOS;

	public Automovil() {
		this.CANTIDAD_MAXIMA_DESTINOS = 3;
		this.VOLUMEN_MAXIMO = 2.0;
		this.PESO_MAXIMO = 500.0;
		this.paquetes = new ArrayList<Paquete>();
		this.destinos = new HashSet<String>();
	}
	
	public Integer cantidadDePaquetes() {
		return this.paquetes.size();
	}

	public Boolean agregarPaquete(Paquete paquete) {
		if(this.destinos.contains(paquete.getCiudad()) || this.destinos.size() < this.CANTIDAD_MAXIMA_DESTINOS
				&& !this.destinos.contains(paquete.getCiudad())) {
			this.destinos.add(paquete.getCiudad());
		} else {
			return Boolean.FALSE;
		}
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
