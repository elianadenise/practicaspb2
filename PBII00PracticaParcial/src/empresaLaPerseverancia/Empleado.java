package empresaLaPerseverancia;

public abstract class Empleado {
	protected Integer horasTrabajadas;
	protected Boolean esCasado;
	protected Integer cantidadDeHijos;
	protected Double sueldoPorHora;
	protected final Double SALARIO_POR_HIJO;
	protected final Double SALARIO_POR_CONYUGE;

	public Empleado(Integer horasTrabajadas, Boolean esCasado, Integer cantidadDeHijos) {
		this.horasTrabajadas = horasTrabajadas;
		this.esCasado = esCasado;
		this.cantidadDeHijos = cantidadDeHijos;
		this.SALARIO_POR_HIJO = 200.0;
		this.SALARIO_POR_CONYUGE = 100.0;
	}

	public abstract Double calcularSueldo();

	protected Double calcularSalarioFamiliar() {
		Double salarioFamiliar = 0.0;
		salarioFamiliar = this.SALARIO_POR_HIJO * this.cantidadDeHijos;
		if(this.esCasado) {
			salarioFamiliar += this.SALARIO_POR_CONYUGE;
		} 
		return salarioFamiliar;
	}
}
