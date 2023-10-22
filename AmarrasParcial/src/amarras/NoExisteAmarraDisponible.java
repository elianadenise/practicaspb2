package amarras;

public class NoExisteAmarraDisponible extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensaje;

	public NoExisteAmarraDisponible() {
	}

	public NoExisteAmarraDisponible(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}

	public void printStackTrace() {
		System.err.println(mensaje);
	}
}
