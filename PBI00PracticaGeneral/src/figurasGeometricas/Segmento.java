package figurasGeometricas;

public class Segmento implements /*Comparable*/ Desplazable, EsParalelo{

	private Punto uno;
	private Punto dos;
	
	public Segmento (Double xUno, Double yUno, Double xDos, Double yDos) {
		this.uno = new Punto(xUno, yUno);
		this.dos = new Punto(xDos, yDos);
	}
	
	public Boolean esParaleloAY() {
		return uno.getX().equals(dos.getX());
	}
	public Boolean esParaleloAX() {
		return uno.getY().equals(dos.getY());
	}

	@Override
	public void desplazar(Double deltaX, Double deltaY) {
		this.uno.desplazar(deltaX, deltaY);
		this.dos.desplazar(deltaX, deltaY);
	}
	
	public Integer compareTo(Segmento segmento) {
		
		if(this.getLongitud().equals(segmento.getLongitud())) {
			return 0;
		} else if (this.getLongitud() < segmento.getLongitud()) {
			return -1;
		} else if (this.getLongitud() > segmento.getLongitud()) {
			return 1;
		}
		return null;
	}
	
	public Double getLongitud() {
		return Math.sqrt((Math.pow((this.dos.getX() - this.uno.getX()), 2) + (Math.pow((this.dos.getY() - this.uno.getY()), 2))));
	}

	public Punto getUno() {
		return uno;
	}

	public void setUno(Punto uno) {
		this.uno = uno;
	}

	public Punto getDos() {
		return dos;
	}

	public void setDos(Punto dos) {
		this.dos = dos;
	}

	
	
}
