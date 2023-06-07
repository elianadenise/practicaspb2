package polimorfismo;

public class Polimorfismo {

	/* Polimorfismo
	 * La habilidad de un elemento del texto del software para denoar, en tiempo de ejecucion,
	 * dos o mas posibles tipos de objetos.
	 * 
	 * Misma interfaz, diferente implementacion. Sustituibilidad (uno se puede hacer pasar por el otro).
	 * del lado izq es clase madre y derecha, clase hija.
	 * Persona persona = new Estudiante(); solo accede a los comportamientos de PERSONA, NO ESTUDIANTE. 
	 * -- todo estudiante se comporta como una persona
	 * -- solo puedo acceder a los comportamientos de una persona, no los de un estudiante
	 * Estudiante estudiante = new Persona() NO ES VALIDO.
	 * 
	 * 
	 * Si hay polimorfismo, hay herencia
	 * un objeto tiene una unica forma.
	 * 
	 * el comportamiento devuelve el comportamiento al que hace referencia en tiempo de ejecucion no en compilacion
	 * se ejecuta la mejor version del metodo. 
	 * 
	 * 
	 * */
	
	/* Interfaz
	 * solo tiene metodos abstractos
	 * 
	 * */
	
	/* public void hacerAlgo(Empleado e) {
		if(e instanceof Gerente) {
			Gerente g = (Gerente) e; // casteo
			g.propiedadGerente();
		}
	}*/
	
	/* si persona es abstracta podemos asignarla asi
	 * Persona persona = new Estudiante()
	 * 
	 * pero no 
	 * Persona persona = new Persona()
	 * 
	 * */
	
}
