package excepcionesPildoras;
import java.util.*;

public class EjemploDos {
	
	public static void main(String[] args) {
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if(decision == 1) {
			// forma 1
			// pedirDatos();
			
			// forma 2 - ideal
			try {
				pedirDatos();
			} catch (InputMismatchException e) {
				System.out.println("Se ha producido una excepcion");
			}
			
		} else {
			System.out.println("Chau chau adios");
			System.exit(0);
		}
		
		entrada.close();
	}

	// forma 1
	/*static void pedirDatos() throws InputMismatchException {
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Nombre:");
			String nombre = entrada.next();
			System.out.println("Edad:");
			Integer edad = entrada.nextInt();
			System.out.println(nombre + " tiene " + edad);
			entrada.close();
		} catch (InputMismatchException e){
			System.out.println("Se ha producido una excepcion");
		}
		// este captura la excepcion en el metodo, que no es lo ideal
		System.out.println("Chau chau adios");
	}*/
	
	// forma 2 - ideal
	static void pedirDatos() throws InputMismatchException {
		// este va a captar la excepcion al momento de llamar al metodo
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre:");
		String nombre = entrada.next();
		System.out.println("Edad:");
		Integer edad = entrada.nextInt();
		System.out.println(nombre + " tiene " + edad);
		entrada.close();

		System.out.println("Se ha producido una excepcion");
		
		System.out.println("Chau chau adios");
	}
	
	
}
