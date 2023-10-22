package amarras;

import java.util.*;

public class Fondeadero {

	private Set<Yate> amarras;
	private Double recaudacionTotal;
	private final Integer CANTIDAD_MAXIMA_AMARRAS;
	
	public Fondeadero(Integer cantidadMaxima) {
		this.amarras = new LinkedHashSet<Yate>();
		this.recaudacionTotal = 0.0;
		this.CANTIDAD_MAXIMA_AMARRAS = cantidadMaxima;
	}
	
	// 2
	public Boolean amarrarYate(Yate yate) throws NoExisteAmarraDisponible {
		if(this.obtenerCantidadDeYatesAmarrados() < this.CANTIDAD_MAXIMA_AMARRAS) {
			return this.amarras.add(yate);
		}
		throw new NoExisteAmarraDisponible("No existe amarra disponible, vuelva en otro momento");
	}
	
	// 3
	public Boolean desamarrarYate(Yate yate) {
		return this.amarras.remove(yate);
	}
	
	// 4
	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.amarras.size();
	}
	
	// 5
	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return this.CANTIDAD_MAXIMA_AMARRAS - this.obtenerCantidadDeYatesAmarrados();
	}
	
	// 6
	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double precio = 0.0;
		if(yate instanceof YateMotor) {
			precio += 10_000.0;
		} else if(yate instanceof YateVela) {
			precio += 9_000.0;
		}
		
		if(yate.getEslora() <= 20) {
			precio += 2_000.0;
		} else {
			precio += 3_000.0;
		}
		
		return precio;
	}
	
	// 7
	public Double obtenerRecaudacionTotal() {
		for(Yate y : amarras) {
			this.recaudacionTotal += this.obtenerPrecioDeAmarre(y);
		}
		return this.recaudacionTotal;
	}
}
