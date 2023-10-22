package callcenter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactoTest {

	@Test
	public void queSePuedaCrearUnContacto() {
		// 1. Preparación
		Contacto esperado;
		final Boolean ES_CLIENTE = false;
		final Boolean DESEA_SER_LLAMADO = true;
		// 2. Ejecución
		esperado = new Contacto();
		// 3. Validación
		assertNotNull(esperado);
			// esto es lo mismo
		assertEquals(ES_CLIENTE, esperado.getEsCliente());
		assertFalse(esperado.getEsCliente());
			//
		assertEquals(DESEA_SER_LLAMADO, esperado.getDeseaSerLlamado());
	}
	@Test
	public void queLosDatosDelContactoSeGuardenCorrectamente() {
		// 1. Preparación
		Contacto nuevo;
		final String NOMBRE_y_APELLIDO_ESPERADO = "Eliana Navarro";
		final String CELULAR_ESPERADO = "+541126524444";
		final String EMAIL_ESPERADO = "eliana@gmail.com";
		final String DIRECCION_ESPERADA = "Avenida Madero 123";
		final Integer CODIGO_POSTAL_ESPERADO = 1001;
		final String LOCALIDAD_ESPERADA = "Madero";
		final Provincia PROVINCIA_ESPERADA = Provincia.BUENOS_AIRES;
		
		// 2. Ejecución
		nuevo = new Contacto(NOMBRE_y_APELLIDO_ESPERADO,CELULAR_ESPERADO,EMAIL_ESPERADO,DIRECCION_ESPERADA,CODIGO_POSTAL_ESPERADO,LOCALIDAD_ESPERADA,PROVINCIA_ESPERADA);
		
		// 3. Validación
		assertNotNull(nuevo);
		assertEquals(NOMBRE_y_APELLIDO_ESPERADO, nuevo.getNombreYApellido());
		assertEquals(CELULAR_ESPERADO, nuevo.getCelular());
		assertEquals(EMAIL_ESPERADO, nuevo.getEmail());
		assertEquals(DIRECCION_ESPERADA, nuevo.getDireccion());
		assertEquals(CODIGO_POSTAL_ESPERADO, nuevo.getCodigoPostal());
		assertEquals(LOCALIDAD_ESPERADA, nuevo.getLocalidad());
		assertEquals(PROVINCIA_ESPERADA, nuevo.getProvincia());
		assertFalse(nuevo.getEsCliente());
		assertTrue(nuevo.getDeseaSerLlamado());
	}
	@Test
	public void queSePuedaRegistrarUnaLlamadaExitosa() {
		Contacto nuevo;
		Llamada nueva;
		final String NOMBRE_y_APELLIDO_ESPERADO = "Eliana Navarro";
		final String CELULAR_ESPERADO = "+541126524444";
		final String EMAIL_ESPERADO = "eliana@gmail.com";
		final String DIRECCION_ESPERADA = "Avenida Madero 123";
		final Integer CODIGO_POSTAL_ESPERADO = 1001;
		final String LOCALIDAD_ESPERADA = "Madero";
		final Provincia PROVINCIA_ESPERADA = Provincia.BUENOS_AIRES;
		final Boolean RESULTADO_DE_LA_LLAMADA_ESPERADA = true;
		final String OBSERVACIONES_ESPERADAS = "Se realizo la venta";
		final Integer CANTIDAD_DE_LLAMADAS_RECIBIDAS_ESPERADAS =  1;
		
		// 2. Ejecución
		nuevo = new Contacto(NOMBRE_y_APELLIDO_ESPERADO,CELULAR_ESPERADO,EMAIL_ESPERADO,DIRECCION_ESPERADA,CODIGO_POSTAL_ESPERADO,LOCALIDAD_ESPERADA,PROVINCIA_ESPERADA);
		nueva = new Llamada(RESULTADO_DE_LA_LLAMADA_ESPERADA,OBSERVACIONES_ESPERADAS);
		nuevo.llamar(nueva);
		// 3. Validacion
		assertEquals(CANTIDAD_DE_LLAMADAS_RECIBIDAS_ESPERADAS, nuevo.getCantidadDeLlamadasRecibidas());
	}
	@Test
	public void queSeValideElFormatoDelEmail() {
		// 1. Preparación
		Contacto nuevo;
		final String EMAIL_ESPERDO = "eliana@eliana.com";
		// 2. Ejecución
		nuevo = new Contacto();
		// 3. Validación
		assertTrue(nuevo.esUnEmailValido(EMAIL_ESPERDO));
	}
	@Test
	public void queSeValideUnEmailSinArroba() {
		/*// 1. Preparación
		Contacto nuevo;
		final String EMAIL_INCORRECTO = "eliana.com";
		// 2. Ejecución
		nuevo = new Contacto();
		// 3. Validación
		assertFalse(nuevo.esUnEmailValido(EMAIL_INCORRECTO));*/
		
		// 1. Preparación
		Contacto nuevo;
		final String EMAIL_INCORRECTO = "eliana.com";
		final Boolean RESULTADO_ESPERADO;
		// 2. Ejecución
		RESULTADO_ESPERADO = Contacto.esUnEmailValido(EMAIL_INCORRECTO);
				
		// 3. Validación
		assertFalse(RESULTADO_ESPERADO);
		
	}
	@Test
	public void queSeValideUnEmailSinPunto() {
		// 1. Preparación
		final String EMAIL_INCORRECTO = "eliana@com";
		final Boolean RESULTADO_ESPERADO;
		// 2. Ejecución
		//nuevo = new Contacto();
		RESULTADO_ESPERADO = Contacto.esUnEmailValido(EMAIL_INCORRECTO);
		
		// 3. Validación
		assertFalse(RESULTADO_ESPERADO);
	}
	@Test
	public void queSeUnEmailSinPuntoYSinArroba() {
		// 1. Preparación
		final String EMAIL_INCORRECTO = "elianacom";
		final Boolean RESULTADO_ESPERADO;
		// 2. Ejecución
		//nuevo = new Contacto();
		RESULTADO_ESPERADO = Contacto.esUnEmailValido(EMAIL_INCORRECTO);
		
		// 3. Validación
		assertFalse(RESULTADO_ESPERADO);
	}
	@Test
	public void queSeRegistreUnaNuevaLlamada() {
		Contacto nuevo;
		Llamada nueva;
		final String NOMBRE_y_APELLIDO_ESPERADO = "Eliana Navarro";
		final String CELULAR_ESPERADO = "+541126524444";
		final String EMAIL_ESPERADO = "eliana@gmail.com";
		final String DIRECCION_ESPERADA = "Avenida Madero 123";
		final Integer CODIGO_POSTAL_ESPERADO = 1001;
		final String LOCALIDAD_ESPERADA = "Madero";
		final Provincia PROVINCIA_ESPERADA = Provincia.BUENOS_AIRES;
		final Boolean RESULTADO_DE_LA_LLAMADA_ESPERADA = true;
		final String OBSERVACIONES_ESPERADAS = "Se realizo la venta";
		
		// 2. Ejecución
		nuevo = new Contacto(NOMBRE_y_APELLIDO_ESPERADO,CELULAR_ESPERADO,EMAIL_ESPERADO,DIRECCION_ESPERADA,CODIGO_POSTAL_ESPERADO,LOCALIDAD_ESPERADA,PROVINCIA_ESPERADA);
		Boolean llamadaRegistrada = nuevo.registrarNuevaLlamada(RESULTADO_DE_LA_LLAMADA_ESPERADA,OBSERVACIONES_ESPERADAS);
		nuevo = null;
		
		// 3. Validacion
		assertTrue(llamadaRegistrada);

	} 
}
