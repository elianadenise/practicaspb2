package excepcionesPildoras;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {
		try {
			division();
		} catch(ArithmeticException e) {
			System.out.println("Estas dividiendo por 0");
			System.out.println("Tipo de error: " + e.getClass().getName());
		} catch(NumberFormatException e) {
			System.out.println("Tenes que ingresar un numero entero");
			System.out.println(e.getMessage());
		} finally {
			// esto se ejecuta siempre
			System.out.println("Division finalizada");
		}
		
	}
	
	static void division() {
		Integer numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo:"));
		Integer numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor: "));
		System.out.println("Resultado: " + numeroUno / numeroDos);
	}
	
}
