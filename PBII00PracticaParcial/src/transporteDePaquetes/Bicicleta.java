package transporteDePaquetes;
import java.util.*;

public class Bicicleta {
	
	private final Integer CANTIDAD_MAXIMA_PAQUETES;
	private final Double VOLUMEN_MAXIMO;
	private final Double PESO_MAXIMO;
	private List<Paquete> paquetes;
	private String destino;

	public Bicicleta() {
		this.CANTIDAD_MAXIMA_PAQUETES = 2;
		this.VOLUMEN_MAXIMO = 0.125;
		this.PESO_MAXIMO = 15.0;
		this.paquetes = new ArrayList<Paquete>();
	}
	
	public Integer cantidadDePaquetes() {
		return this.paquetes.size();
	}

	public Boolean agregarPaquete(Paquete paquete) {
		if(this.destino == null) {
			this.destino = paquete.getCiudad();
		}
		if(this.cantidadDePaquetes() < this.CANTIDAD_MAXIMA_PAQUETES && 
				paquete.getVolumen() < this.VOLUMEN_MAXIMO && 
				paquete.getPeso() < this.PESO_MAXIMO && 
				paquete.getCiudad().equals(this.destino)) {
			return this.paquetes.add(paquete);
		}
		return Boolean.FALSE;
	}

}
