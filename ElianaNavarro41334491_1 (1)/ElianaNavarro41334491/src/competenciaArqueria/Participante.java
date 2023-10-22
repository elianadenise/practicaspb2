package competenciaArqueria;

import java.util.LinkedList;

public class Participante implements Comparable<Participante>{
	private LinkedList<Tiro> tiros;
	private Integer numeroParticipante;
	private Integer puntajeAcumulado;
	
	public Participante(Integer numero) {
		this.numeroParticipante = numero;
		this.tiros = new LinkedList<Tiro>();
		this.puntajeAcumulado = 0;
	}
	
	public Boolean agregarTiro(Tiro tiro) {
		if(tiro.getPuntaje() > 0) {
			if (this.tiros.size() < 5) {
				return this.tiros.add(tiro);
			} else if (this.tiros.size() == 5) {
				for (Tiro t : this.tiros) {
					if (t.getPuntaje() < tiro.getPuntaje()) {
						this.tiros.remove(t);
						return this.tiros.add(tiro);
					}
				}
			}
		}
		return Boolean.FALSE;
	}
	
	public Integer puntosAcumulados() {
		for(Tiro t : this.tiros) {
			this.puntajeAcumulado += t.getPuntaje();
		}
		return this.puntajeAcumulado;
	}

	@Override
	public int compareTo(Participante o) {
		return this.puntajeAcumulado.compareTo(o.puntajeAcumulado);
	}
	
	
	public Integer cantidadTiros() {
		return this.tiros.size();
	}

	public LinkedList<Tiro> getTiros() {
		return tiros;
	}

	public void setTiros(LinkedList<Tiro> tiros) {
		this.tiros = tiros;
	}

	@Override
	public String toString() {
		return "Participante [puntajeAcumulado="
				+ puntajeAcumulado + "]";
	}

	
	
	
}
