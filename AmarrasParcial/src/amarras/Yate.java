package amarras;

import java.util.Objects;

public abstract class Yate {

	protected String nombre;
	protected String duenio;
	protected Double manga;
	protected Double calado;
	protected Double eslora;
	protected Integer tripulacion;
	protected Double peso;
	
	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public Double getEslora() {
		return eslora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calado, duenio, eslora, manga, nombre, peso, tripulacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(calado, other.calado) && Objects.equals(duenio, other.duenio)
				&& Objects.equals(eslora, other.eslora) && Objects.equals(manga, other.manga)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(peso, other.peso)
				&& Objects.equals(tripulacion, other.tripulacion);
	}
	
	
}
