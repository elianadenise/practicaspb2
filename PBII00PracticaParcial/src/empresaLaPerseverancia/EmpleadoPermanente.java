package empresaLaPerseverancia;

public class EmpleadoPermanente extends Empleado{

	protected Integer antiguedad;
	protected Double sueldoPorAntiguedad;

	public EmpleadoPermanente(Integer horasTrabajadas, Integer antiguedad, Boolean esCasado, Integer cantidadDeHijos) {
		super(horasTrabajadas, esCasado, cantidadDeHijos);
		this.antiguedad = antiguedad;
		this.sueldoPorHora = 300.0;
		this.sueldoPorAntiguedad = 100.0;
	}

	public Double calcularSueldo() {
		Double sueldoTotal = 0.0;
		return sueldoTotal = this.sueldoPorHora * this.horasTrabajadas + this.sueldoPorAntiguedad * this.antiguedad + this.calcularSalarioFamiliar();
	}

}
