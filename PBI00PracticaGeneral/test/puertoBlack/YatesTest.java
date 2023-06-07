package puertoBlack;

import static org.junit.Assert.*;

import org.junit.Test;

public class YatesTest {

	@Test
	public void queSePuedaCrearUnYateAMotor() {
		String nombre = "AZ1";
		String duegno = "Andrés Bogeat";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 199.0;
		Integer tripulacion = 37;
		Double peso = 5500.0;
		Double desplazamiento = 5959.0;
		String propulsion = "2 × motores diésel MAN RK2805";
		Double potencia = 9000.0;
		Double velocidad = 23.0;
		Double autonomia = 6500.0;
		YateAMotor yateAMotor;
		
		yateAMotor = new YateAMotor(nombre, duegno, manga, calado, eslora, tripulacion, peso, desplazamiento, propulsion, potencia, velocidad, autonomia);
		
		assertNotNull(yateAMotor);
	}

	@Test
	public void queSePuedaCrearUnYateAVela() {
		String nombre = "XXR";
		String duegno = "Sebastian Pardo";
		Double manga = 6.90;
		Double calado = 2.7;
		Double eslora = 13.45;
		Integer tripulacion = 5;
		Double peso = 1400.0;
		Double alturaMastil = 21.5;
		Double superficieVelicaMayor = 85.5;
		Double superficieTotal = 133.0;
		YateAVela yateAVela;
		
		yateAVela = new YateAVela(nombre, duegno, manga, calado, eslora, tripulacion, peso, alturaMastil, superficieVelicaMayor, superficieTotal);
		
		assertNotNull(yateAVela);
	}
}
