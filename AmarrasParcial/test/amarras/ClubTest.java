package amarras;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClubTest {

	@Test
	public void queSePuedanAmarrarYatesAlFondeadero() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(70);

		assertTrue(puertoBlack.amarrarYate(vela));
		assertTrue(puertoBlack.amarrarYate(motor));
		assertEquals(new Integer(2), puertoBlack.obtenerCantidadDeYatesAmarrados());
	}

	@Test(expected = NoExisteAmarraDisponible.class)
	public void queNoSePuedanAmarrarYatesPorFaltaDeDisponibilidad() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Yate motorDos = new YateMotor("az1", "Eliana", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate velaDos = new YateVela("xxr", "Maximiliano", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(3);

		assertTrue(puertoBlack.amarrarYate(vela));
		assertTrue(puertoBlack.amarrarYate(motor));
		assertTrue(puertoBlack.amarrarYate(motorDos));
		assertFalse(puertoBlack.amarrarYate(motorDos));
	}

	@Test
	public void queNoSePuedanAmarrarYatesPorFaltaDeDisponibilidadEnConsola() {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Yate motorDos = new YateMotor("az1", "Eliana", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate velaDos = new YateVela("xxr", "Maximiliano", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(3);

		try {
			assertTrue(puertoBlack.amarrarYate(vela));
			assertTrue(puertoBlack.amarrarYate(motor));
			assertTrue(puertoBlack.amarrarYate(motorDos));
			assertFalse(puertoBlack.amarrarYate(motorDos));
		} catch (NoExisteAmarraDisponible e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void queSePuedaDesamarrarYate() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(70);

		puertoBlack.amarrarYate(vela);
		puertoBlack.amarrarYate(motor);
		assertTrue(puertoBlack.desamarrarYate(vela));
		assertEquals(new Integer(1), puertoBlack.obtenerCantidadDeYatesAmarrados());
	}
	
	@Test
	public void queSePuedaObtenerLaCantidadDeAmarrasDisponibles() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(70);

		puertoBlack.amarrarYate(vela);
		puertoBlack.amarrarYate(motor);
		
		assertEquals(new Integer(2), puertoBlack.obtenerCantidadDeYatesAmarrados());
		
		assertEquals(new Integer(68), puertoBlack.obtenerCantidadDeAmarrasDisponibles());
	}
	

	@Test
	public void queSePuedaObtenerElPrecioDeAmarrePorBarco() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Yate motorDos = new YateMotor("az1", "Eliana", 18.87, 5.15, 15.2, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate velaDos = new YateVela("xxr", "Maximiliano", 6.90, 2.7, 25.5, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(70);

		puertoBlack.amarrarYate(vela);
		puertoBlack.amarrarYate(motor);
		puertoBlack.amarrarYate(velaDos);
		puertoBlack.amarrarYate(motorDos);
		
		
		assertEquals(new Double(11000.0), puertoBlack.obtenerPrecioDeAmarre(vela));
		assertEquals(new Double(12000.0), puertoBlack.obtenerPrecioDeAmarre(velaDos));
		assertEquals(new Double(13000.0), puertoBlack.obtenerPrecioDeAmarre(motor));
		assertEquals(new Double(12000.0), puertoBlack.obtenerPrecioDeAmarre(motorDos));
	}

	@Test
	public void queSePuedaObtenerLaRecaudacionTotal() throws NoExisteAmarraDisponible {
		Yate motor = new YateMotor("az1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate vela = new YateVela("xxr", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85, 133);
		Yate motorDos = new YateMotor("az1", "Eliana", 18.87, 5.15, 15.2, 37, 5500.0, 5959,
				"2 × motores diésel MAN RK2805", 9000, 23, 6500);
		Yate velaDos = new YateVela("xxr", "Maximiliano", 6.90, 2.7, 25.5, 5, 1400.0, 21.5, 85, 133);
		Fondeadero puertoBlack = new Fondeadero(70);

		puertoBlack.amarrarYate(vela);
		puertoBlack.amarrarYate(motor);
		puertoBlack.amarrarYate(velaDos);
		puertoBlack.amarrarYate(motorDos);
		
		
		assertEquals(new Double(48000.0), puertoBlack.obtenerRecaudacionTotal());
	}
}
