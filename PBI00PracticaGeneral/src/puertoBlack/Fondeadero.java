package puertoBlack;

import java.util.*;

public class Fondeadero {

	private List<Yate> yatesAmarrados;
	private Integer maximaDeAmarras;
	
	public Fondeadero(Integer maximaDeAmarras) {
		this.maximaDeAmarras = maximaDeAmarras;
		this.yatesAmarrados = new LinkedList<Yate>();
	}	

	public List<Yate> getYatesAmarrados() {
		return yatesAmarrados;
	}

	public Integer getMaximaDeAmarras() {
		return maximaDeAmarras;
	}
	
	public Boolean amarrarYate(Yate yate) {
		if(this.yatesAmarrados.size() <= this.maximaDeAmarras) {
			return this.yatesAmarrados.add(yate);
		}
		return Boolean.FALSE;
	}
	
	public Boolean desamarrarYate(Yate yate) {
		return this.yatesAmarrados.remove(yate);
	}

	public Integer obtenerCantidadDeYatesAmarrado() {
		return this.yatesAmarrados.size();
	}

	public Integer obtenerCantidadDeAmarrasDisponibles() {
	    Integer cantidadAmarrasOcupadas = obtenerCantidadDeYatesAmarrado();
	    Integer amarrasDisponibles = this.getMaximaDeAmarras() - cantidadAmarrasOcupadas;
	    return amarrasDisponibles;
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double precio = 0.0;
		Double precioAMotor = 10000.0;
		Double precioAVela = 9000.0;
		if(yate instanceof YateAMotor) {
			precio += precioAMotor;
		} else if(yate instanceof YateAVela) {
			precio += precioAVela;
		}
		if(yate.getEslora() <= 20.0) {
			precio += 2000.0;
		} else {
			precio += 3000.0;
		}
		return precio;
	}

	public Double obtenerRecaudacionTotal() {
		Double recaudacion = 0.0;
		for(Yate yate : this.yatesAmarrados) {
			recaudacion += this.obtenerPrecioDeAmarre(yate);
		}
		return recaudacion;
	}


	
	
}
