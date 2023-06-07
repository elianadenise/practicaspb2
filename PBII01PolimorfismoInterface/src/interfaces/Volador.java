package interfaces;

public interface Volador {
	/* establece comportamientos similares 
	 * para clases que no tienen nada que ver corte pajaro y avion
	 * */
	void despegar();
	void aterrizar();
	void volar();
	// son public y abstract por defecto, no hace falta declararlo.
}
