package transporteDePaquetes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	@Test
	public void queSePuedaCrearUnCamion() {
		Camion camion;
		
		camion = new Camion();
		
		assertNotNull(camion);
	}

}
