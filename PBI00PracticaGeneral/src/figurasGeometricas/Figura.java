package figurasGeometricas;

public abstract class Figura implements Desplazable /*, Comparable*/ {

	protected Punto punto;
	
	public Figura(Double x, Double y) {
		this.punto = new Punto(x, y);
	}
	
	public void desplazar(Double deltaX, Double deltaY) {
		this.punto.desplazar(deltaX, deltaY);
	}
	
	public abstract Double getArea();
	
	public Integer compareTo(Figura figura) {
		
		if(this.getArea().equals(figura.getArea())) {
			return 0;
		} else if (this.getArea() < figura.getArea()) {
			return -1;
		} else if (this.getArea() > figura.getArea()) {
			return 1;
		}
		
		return null;
	}

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	
}
