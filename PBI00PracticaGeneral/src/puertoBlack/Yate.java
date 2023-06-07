package puertoBlack;

public abstract class Yate {

	protected String nombre;
	protected String duegno;
	protected Double manga;
	protected Double calado;
	protected Double eslora;
	protected Integer tripulacion;
	protected Double peso;
	
	public Yate(String nombre, String duegno, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso) {
		this.nombre = nombre;
		this.duegno = duegno;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public Double getEslora() {
		return eslora;
	}
	
	
}
