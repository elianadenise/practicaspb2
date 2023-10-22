package amarras;

public class YateMotor extends Yate {

	private String propulsion;
	private Integer desplazamiento;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;

	public YateMotor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Integer desplazamiento, String propulsion, Integer potencia, Integer velocidad, Integer autonomia) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

}
