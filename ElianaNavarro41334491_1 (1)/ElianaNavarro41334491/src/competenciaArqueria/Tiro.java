package competenciaArqueria;

public class Tiro{
	private Double coordenadaX;
	private Double coordenadaY;
	private Integer puntaje;
	private Double distancia;
	
	public Tiro(Double coordenadaX, Double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.distancia = 0.0;
		this.setPuntaje();
	}

	public Double getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(Double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public Double getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(Double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje() {
		this.distancia = Math.sqrt((Math.pow(this.coordenadaX, 2) + Math.pow(this.coordenadaY, 2)));
		if(distancia <= 10) {
			this.puntaje = 1000;
		} else if(distancia > 10 && distancia <= 20) {
			this.puntaje = 500;
		} else if (distancia > 20 && distancia <= 30) {
			this.puntaje = 200;
		} else if (distancia > 30 && distancia <= 40) {
			this.puntaje = 100;
		} else if (distancia > 40 && distancia <= 50) {
			this.puntaje = 50;
		} else {
			this.puntaje = 0;
		}
	}

	@Override
	public String toString() {
		return "Tiro [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", puntaje=" + puntaje + "]";
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	
	
	
}
