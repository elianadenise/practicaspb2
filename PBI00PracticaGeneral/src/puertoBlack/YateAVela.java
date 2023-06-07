package puertoBlack;

public class YateAVela extends Yate{

	private Double alturaMastil;
	private Double superficieVelicaMayor;
	private Double superficieTotal;
	
	public YateAVela(String nombre, String duegno, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Double superficieVelicaMayor, Double superficieTotal) {
		super(nombre, duegno, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

}
