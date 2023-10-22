package empresaLaPerseverancia;
import java.util.*;

public class Empresa {

	private Integer cuit;
	private String razonSocial;
	private List<Empleado> empleados;

	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.empleados = new ArrayList<Empleado>();
	}

	public Boolean contratarEmpleado(Empleado empleado) {
		return this.empleados.add(empleado);
	}

	public Double calcularGastoEnSueldos() {
		Double gastosEnSueldos = 0.0;
		for(Empleado empleado : this.empleados) {
			gastosEnSueldos += empleado.calcularSueldo();
		}
		return gastosEnSueldos;
	}

}
