package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void queSePuedaCrearUnaEmpresa() {
		Empresa empresa;
		Integer cuit;
		String razonSocial;
		
		cuit = 234243;
		razonSocial = "servicios";
		empresa = new Empresa(cuit, razonSocial);
		
		assertNotNull(empresa);
	}
	
	@Test
	public void queSePuedaIngresarEmpleadosALaEmpresa() {
		Empresa empresa;
		Integer cuit;
		String razonSocial;
		EmpleadoGerente gerente;
		EmpleadoTemporario temporario;
		EmpleadoPermanente permanenteUno;
		EmpleadoPermanente permanenteDos;
		
		permanenteDos = new EmpleadoPermanente(160, 4, Boolean.FALSE, 0);
		permanenteUno = new EmpleadoPermanente(80, 6, Boolean.TRUE, 2);
		temporario = new EmpleadoTemporario(80, Boolean.TRUE, 0);
		gerente = new EmpleadoGerente(160, 10, Boolean.TRUE, 1);
		cuit = 234243;
		razonSocial = "servicios";
		empresa = new Empresa(cuit, razonSocial);
		Boolean empleadoUno = empresa.contratarEmpleado(gerente);
		Boolean empleadoDos = empresa.contratarEmpleado(temporario);
		Boolean empleadoTres = empresa.contratarEmpleado(permanenteUno);
		Boolean empleadoCuatro = empresa.contratarEmpleado(permanenteDos);
		
		assertTrue(empleadoUno);
		assertTrue(empleadoDos);
		assertTrue(empleadoTres);
		assertTrue(empleadoCuatro);
	}

	@Test
	public void queSePuedaCalcularGastosPorSalarios() {
		Empresa empresa;
		Integer cuit;
		String razonSocial;
		EmpleadoGerente gerente;
		EmpleadoTemporario temporario;
		EmpleadoPermanente permanenteUno;
		EmpleadoPermanente permanenteDos;
		Double resultadoEsperado;
		Double resultadoObtenido;
		
		permanenteDos = new EmpleadoPermanente(160, 4, Boolean.FALSE, 0);
		permanenteUno = new EmpleadoPermanente(80, 6, Boolean.TRUE, 2);
		temporario = new EmpleadoTemporario(80, Boolean.TRUE, 0);
		gerente = new EmpleadoGerente(160, 10, Boolean.TRUE, 1);
		cuit = 234243;
		razonSocial = "servicios";
		empresa = new Empresa(cuit, razonSocial);
		empresa.contratarEmpleado(gerente);
		empresa.contratarEmpleado(temporario);
		empresa.contratarEmpleado(permanenteUno);
		empresa.contratarEmpleado(permanenteDos);
		resultadoEsperado = 155_400.0;
		resultadoObtenido = empresa.calcularGastoEnSueldos();
		
		assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
	}

}
