package figurasGeometricas;

// import static java.lang.Math.*;
import static java.lang.Math.sqrt;

import java.util.Objects;

import static java.lang.Math.pow;

public class Punto implements Desplazable{

	private Double x;
	private Double y;

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double distancia(Punto punto) {
		Double distancia = 0.0;
		distancia = sqrt(pow(punto.getX() - this.x, 2) + pow(punto.getY() - this.y, 2));
		return distancia;
	}

	public void desplazar(Double deltaX, Double deltaY) {
		this.setX(this.x + deltaX);
		this.setY(this.y + deltaY);
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override // para que de el test
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override // para que de el test
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}
	
}
