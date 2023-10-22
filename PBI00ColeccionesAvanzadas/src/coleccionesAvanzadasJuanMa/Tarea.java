package coleccionesAvanzadasJuanMa;

public class Tarea {

	private Usuario creador;
	private EstadoDeLaTarea estado;
	
	public Tarea(Usuario usuario, EstadoDeLaTarea estado) {
		this.creador = usuario;
		this.estado = estado;
	}

	public Usuario getCreador() {
		return creador;
	}

	public void setCreador(Usuario usuario) {
		this.creador = usuario;
	}

	public EstadoDeLaTarea getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeLaTarea estado) {
		this.estado = estado;
	}

	
}
