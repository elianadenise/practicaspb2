package puertoBlack;

import static org.junit.Assert.*;

import org.junit.Test;

public class FondeaderoTest {

	// 1
	@Test
	public void queSePuedaCrearUnFondeadero() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		
		assertNotNull(fondeadero);		
	}

	// 2
	@Test
	public void queSePuedaAmarrarYate() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		Boolean agregarUno = fondeadero.amarrarYate(yateAMotor);
		Boolean agregarDos = fondeadero.amarrarYate(yateAVela);
		Integer valorEsperado = 2;
		Integer valorResultado = fondeadero.getYatesAmarrados().size();
		
		assertTrue(agregarUno);
		assertTrue(agregarDos);
		assertEquals(valorEsperado, valorResultado);
	}
	
	// 3
	@Test
	public void queSePuedaDesamarrarYate() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		fondeadero.amarrarYate(yateAMotor);
		fondeadero.amarrarYate(yateAVela);
		Boolean agregarUno = fondeadero.desamarrarYate(yateAMotor);
		Integer valorEsperado = 1;
		Integer valorResultado = fondeadero.getYatesAmarrados().size();
		
		assertTrue(agregarUno);
		assertEquals(valorEsperado, valorResultado);
	}
	
	// 4
	@Test
	public void queSePuedaObtenerCantidadDeYatesAmarrado() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		fondeadero.amarrarYate(yateAMotor);
		fondeadero.amarrarYate(yateAVela);
		Integer valorEsperado = 2;
		Integer valorResultado = fondeadero.obtenerCantidadDeYatesAmarrado();
		
		assertEquals(valorEsperado, valorResultado);
	}
	
	// 5
	@Test
	public void queSePuedaObtenerCantidadDeAmarrasDisponibles() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		fondeadero.amarrarYate(yateAMotor);
		fondeadero.amarrarYate(yateAVela);
		Integer valorEsperado = 68;
		Integer valorResultado = fondeadero.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorResultado);
	}
	
	// 6
	@Test
	public void queSePuedaObtenerElPrecioDeAmarre() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		fondeadero.amarrarYate(yateAMotor);
		fondeadero.amarrarYate(yateAVela);
		Double esperadoMotor = 13000.0;
		Double resultadoMotor = fondeadero.obtenerPrecioDeAmarre(yateAMotor);
		Double esperadoVela = 11000.0;
		Double resultadoVela = fondeadero.obtenerPrecioDeAmarre(yateAVela);
		
		assertEquals(esperadoMotor, resultadoMotor);
		assertEquals(esperadoVela, resultadoVela);
	}
	
	// 7
	@Test
	public void queSePuedaObtenerRecaudacionTotal() {
		Fondeadero fondeadero;
		Integer maximaDeAmarras = 70;
		YateAMotor yateAMotor = new YateAMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0, "2 × motores diésel MAN RK2805", 9000.0, 23.0, 6500.0);
		YateAVela yateAVela = new YateAVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		
		fondeadero = new Fondeadero(maximaDeAmarras);
		fondeadero.amarrarYate(yateAMotor);
		fondeadero.amarrarYate(yateAVela);
		Double esperado = 24000.0;
		Double resultado = fondeadero.obtenerRecaudacionTotal();
		
		assertEquals(esperado, resultado);
	}
}
