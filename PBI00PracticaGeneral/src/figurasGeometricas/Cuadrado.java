package figurasGeometricas;

public class Cuadrado extends Figura implements Desplazable/*, Comparable*/ {

	private Double lado;

	// falta lado
	public Cuadrado (Double x, Double y, Double lado) {
		super(x, y);
		this.lado = lado;
	}
	
	
	/*public void desplazar(Double deltaX, Double deltaY) {
		super.desplazar(deltaX, deltaY);
	}*/

	@Override
	public Double getArea() {
		return Math.pow(this.lado, 2);
	}



}
