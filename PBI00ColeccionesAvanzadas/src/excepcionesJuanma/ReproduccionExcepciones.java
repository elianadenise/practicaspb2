package excepcionesJuanma;
import java.util.*;
public class ReproduccionExcepciones {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Alumno actual = null;
		
		// 1. NullPointerException
		System.out.println(actual.calcularPorcentajeAsistencias());
		// no es necesario incluir manejo de excepciones cuando da nullpointerexception
		// porque es prevenible escribiendo bien el codigo
		
		if(actual instanceof Object) { // evito erroes de ClassCastException
			Object o = (Object) actual;
		}
		
		// 2. AristhmeticException
		// System.out.println(5/0);
		
		// 3. InputMismatchException
		
		int a = 0;
		
		while(a == 0) {
			System.out.println("Ingrese un numero:");
			try {
				a = entrada.nextInt();
			} catch(InputMismatchException e) {
				System.err.println("Debia ingresar un numero");
				entrada.next(); // limpio el teclado para que no haya error
			}
		}
		
	}

}
