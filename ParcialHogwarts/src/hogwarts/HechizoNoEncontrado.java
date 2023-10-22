package hogwarts;

public class HechizoNoEncontrado extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;

	public HechizoNoEncontrado(String string) {
		super(string);
		this.mensaje = string;
	}

	public HechizoNoEncontrado() {}
	
	public void printStackTrace() {
		System.err.println(mensaje);
	}
}
