package ar.edu.unlam.pb2.eva03;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
public class Anfibio extends Vehiculo implements Terrestre, Acuatico{

	private Double profundidad;
	private Double velocidad; 
	public Anfibio(String codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
