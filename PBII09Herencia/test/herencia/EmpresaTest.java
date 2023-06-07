package herencia;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void test() {
		Empleado empleado = new Gerente();
		Gerente gerente = new Empleado();
	}

}
