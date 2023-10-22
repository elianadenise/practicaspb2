package empresaLaPerseverancia;

public class EmpleadoGerente extends EmpleadoPermanente{

	public EmpleadoGerente(Integer horasTrabajadas, Integer antiguedad, Boolean esCasado, Integer cantidadDeHijos) {
		super(horasTrabajadas, antiguedad, esCasado, cantidadDeHijos);
		this.sueldoPorHora = 400.0;
		this.sueldoPorAntiguedad = 150.0;
	}

}
