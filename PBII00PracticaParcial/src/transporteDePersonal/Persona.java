package transporteDePersonal;

public class Persona {

	private Boolean esChofer;
	private Integer posicion;
	
	public Persona(Boolean esChofer) {
		this.esChofer = esChofer;
		this.posicion = null;
	}

	public Boolean getEsChofer() {
		return esChofer;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getPosicion() {
		return posicion;
	}
	
	
	
	
}
