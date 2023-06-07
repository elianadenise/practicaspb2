package pildoras;

public class Jefe extends Empleado{
	
	// atributos
	private Double incentivo;
	
	// constructor
	public Jefe(String nombre, Double sueldo, Integer anio, Integer mes, Integer dia) {
		super(nombre, sueldo, anio, mes-1, dia);
	}

	// gets&sets
	public void setIncentivo(Double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public Double getSueldo() {
		Double sueldoJefe = super.getSueldo(); /* llama al metodo original de la super */
		return sueldoJefe + this.incentivo;
	}
}
