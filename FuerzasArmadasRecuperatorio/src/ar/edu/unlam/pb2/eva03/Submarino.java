package ar.edu.unlam.pb2.eva03;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Submarino(String codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}

	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
