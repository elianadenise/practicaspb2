package fechas;

import java.util.Objects;

public class Fecha {
	private Integer anio;
	private Integer mes;
	private Integer dia;

	public Fecha(Integer anio, Integer mes, Integer dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return Objects.equals(anio, other.anio) && Objects.equals(dia, other.dia) && Objects.equals(mes, other.mes);
	}
	
	
}
