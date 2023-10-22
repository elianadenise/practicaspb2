package excepcionesPildoras;

import javax.swing.JOptionPane;

public class Ejemplos {
	
	// cuando hay error en compilacion, se crea un objeto error
	// cuando hay error suele ser un problema en memoria, algo en el hardware
	// los errores manejables son los que derivan de excepcion, no de error
	
	// IOException son excepciones comprobadas, no son culpa del programador
	// RuntimeExceptions son excepciones no comprobadas, errores del programador

	
	public static void main(String[] args) {
		int [] matriz = new int[5];
		
		matriz[0] = 5;
		matriz[1] = 2;
		matriz[2] = 6;
		matriz[3] = 4;
		matriz[4] = 8;
		matriz[5] = 7;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + matriz[i]);
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		System.out.println("Hola " + nombre + " tenes " + edad + " años. " + "el programa terminó su ejecución");
	}
	
	// metodo con throws, se escribe un try and catch
	
	
}