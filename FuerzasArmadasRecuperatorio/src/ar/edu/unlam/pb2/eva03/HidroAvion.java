package ar.edu.unlam.pb2.eva03;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
public class HidroAvion extends Avion implements Acuatico {

	private Double profundidad;
	private Double altitud;
	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.altitud = 0.0;
	}
	public HidroAvion(String codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.altitud = 0.0;
	}

	public Double getAltitud() {
		// TODO Auto-generated method stub
		return this.altitud;
	}

	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}


}
