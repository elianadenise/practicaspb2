package amarras;

public class YateVela extends Yate {

	private Double alturaMastil;
	private Integer superficieVelicaMayor;
	private Integer superficieTotal;

	public YateVela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Integer superficieVelicaMayor, Integer superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

}
