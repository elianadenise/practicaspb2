package cuentaBancaria;

public class NoPoseeSaldoDisponible extends Exception {

	private static final long serialVersionUID = 1L;

	public NoPoseeSaldoDisponible(String mensaje) {
		super(mensaje);
	}

	public NoPoseeSaldoDisponible() {
	}
}
