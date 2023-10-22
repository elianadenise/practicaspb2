package cuentabancaria;

public class SaldoInsuficiente extends Exception {

	// al ser hija de exception, mi clase va a poder ser lanzada
	
	public SaldoInsuficiente() {
		super("Se genera una excepcion por intentar retirar monto mayor al disponible");
	}
	public SaldoInsuficiente(String mensaje) {
		super(mensaje);
	}
	
	public void printStackTrace() {
		System.err.println("No imprimimos el StackTrace, decimos holita");
	}
}
