package callcenter;

public class Llamada {

	private Boolean fueExistosa;
	private String observaciones;
	
	public Llamada(Boolean fueExitosa, String observaciones) {
		this.setFueExistosa(fueExitosa);
		this.setObservaciones(observaciones);
	}

	public Boolean getFueExistosa() {
		return fueExistosa;
	}

	public void setFueExistosa(Boolean fueExistosa) {
		this.fueExistosa = fueExistosa;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
