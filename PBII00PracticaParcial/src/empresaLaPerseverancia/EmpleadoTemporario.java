package empresaLaPerseverancia;

public class EmpleadoTemporario extends Empleado{

	public EmpleadoTemporario(Integer horasTrabajadas, Boolean esCasado, Integer cantidadDeHijos) {
		super(horasTrabajadas, esCasado, cantidadDeHijos);
		this.sueldoPorHora = 200.0;
	}

	public Double calcularSueldo() {
		Double sueldoTotal = 0.0;
		return sueldoTotal = this.sueldoPorHora * this.horasTrabajadas + this.calcularSalarioFamiliar();
	}
}
