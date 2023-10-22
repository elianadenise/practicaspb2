package clubDeDeportes;

import interfaces.INadador;

public class Nadador extends Deportista implements INadador {

	private String estiloPreferido;

	public Nadador(Integer codigo, String nombre, String estiloPreferido) {
		super(codigo, nombre);
		this.estiloPreferido = estiloPreferido;
	}

	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}


}
