package puertoBlack;

public class YateAMotor extends Yate{

	private Double desplazamiento;
	private String propulsion;
	private Double potencia;
	private Double velocidad;
	private Double autonomia;

	public YateAMotor(String nombre, String duegno, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double desplazamiento, String propulsion, Double potencia, Double velocidad,
			Double autonomia) {
		super(nombre, duegno, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

}
