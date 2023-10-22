package clubDeDeportes;

public class NoEstaPreparado extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoEstaPreparado() {}
	public NoEstaPreparado(String mensaje) {
		super(mensaje);
	}
	
	public void printStackTrace() {
		System.err.println("No esta PREPARADO");
	}
}
