package monitoreo;

import java.util.Objects;

public abstract class MedioTransporte {

	protected Double latitud;
	protected Double longitud;
	
	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	protected void actualizarCoordenadas(Double latitud, Double longitud) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioTransporte other = (MedioTransporte) obj;
		return Objects.equals(latitud, other.latitud) && Objects.equals(longitud, other.longitud);
	}
	
}
