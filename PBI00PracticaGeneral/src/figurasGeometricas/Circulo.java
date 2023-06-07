package figurasGeometricas;

public class Circulo extends Figura implements Desplazable /*, Comparable */ {

	private Double radio;
	
	public Circulo (Double x, Double y, Double radio) {
		super(x, y);
		this.radio = radio;
	}

	@Override
	public Double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	
	
}
