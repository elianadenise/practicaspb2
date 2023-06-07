package pildoras;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{

	// atributos
	private Double sueldo;
	private Date altaContrato; /* ver esto, esta cheto */
	private Integer id;
	private static Integer IdSiguiente = 0;
	
	// constructores
	public Empleado(String nombre, Double sueldo, Integer anio, Integer mes, Integer dia) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.altaContrato = calendario.getTime();
		++Empleado.IdSiguiente;
		this.id = Empleado.IdSiguiente;
	}
	public Empleado(String nombre) {
		this(nombre, 30_000.0, 2023, 01, 01); 
		/* Constructor con inicializacion estandar, por si solo quiero crear empleado con nombre*/
	}
	
	// gets&sets
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double porcentaje) {
		Double aumento = sueldo*porcentaje/100;
		this.sueldo += aumento;
	}
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	// metodo abstracto
	public String getDescripcion() {
		return "Empleado id " + this.id + " tiene un sueldo de: $" + this.sueldo;
	}
}
