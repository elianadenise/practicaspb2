package coleccionesAvanzadasJuanMa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {

	@Test
	public void queSePuedaValidarSiDosUsuariosSonIgualesConIgualIgual() {
		Usuario usuarioUno = new Usuario("Eliana");
		Usuario usuarioDos = new Usuario("Eliana");
		usuarioUno = usuarioDos;
		
		if(usuarioUno == usuarioDos) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}
	}

	@Test
	public void queSePuedaValidarSiDosUsuariosSonIgualesConEquals() {
		Usuario usuarioUno = new Usuario("Eliana");
		Usuario usuarioDos = new Usuario("Eliana");
		
		if(usuarioUno.equals(usuarioDos)) { 
			System.out.println("son iguales");
			// son iguales porque... hicimos hashcode y equals
		} else {
			System.out.println("no son iguales");
		}
	}
}
