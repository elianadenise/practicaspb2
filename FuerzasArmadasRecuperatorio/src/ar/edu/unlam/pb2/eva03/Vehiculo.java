package ar.edu.unlam.pb2.eva03;
import java.util.Objects;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
public class Vehiculo {

	protected Integer codigoI;
	protected String nombre;
	protected Double altura;

	public Vehiculo(String codigo, String nombre) {
		this.codigoI = Integer.parseInt(codigo);
		this.nombre = nombre;
	}

	public Vehiculo(Integer codigo, String nombre) {
		this.codigoI = codigo;
		this.nombre = nombre;
	}



	@Override
	public int hashCode() {
		return Objects.hash(codigoI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigoI, other.codigoI);
	}

	public void setCodigoI(Integer codigoI) {
		this.codigoI = codigoI;
	}

	public Integer getCodigoI() {
		return codigoI;
	}
	
	
}
