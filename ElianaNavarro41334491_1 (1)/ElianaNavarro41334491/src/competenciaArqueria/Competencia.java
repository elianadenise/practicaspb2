package competenciaArqueria;

import java.util.*;

public class Competencia {

	private Set<Participante> participantes;
	private LinkedList<Participante> podio;
	public Competencia() {
		this.participantes = new HashSet<Participante>();
		this.podio = new LinkedList<Participante>();
	}
	
	public Boolean agregarParticipanteCalificado(Participante participante) throws DescalificadoException {
		if(participante.puntosAcumulados() > 0) {
			return this.participantes.add(participante);
		}
		throw new DescalificadoException("El participante queda descalificado por no alcanzar puntos");
	}
	
	public void establecerPodio() {		
		for(Participante p : this.participantes) {
			if(this.podio.size() < 3) {
				this.podio.add(p);
			} else if(this.podio.size() == 3){
				for(Participante o : this.podio) {
					if(p.puntosAcumulados() > o.puntosAcumulados()) {
						this.podio.remove(o);
						this.podio.add(p);
					}
				}

			}
		}
		Collections.sort(this.podio, Collections.reverseOrder());
		
	}
	
	
		
	public Integer cantidadParticipantesCalificados() {
		return this.participantes.size();
	}
	
	public Integer cantidadParticipantesEnPodio() {
		return this.podio.size();
	}

	public LinkedList<Participante> getPodio() {
		return podio;
	}

	public void setPodio(LinkedList<Participante> podio) {
		this.podio = podio;
	}
	
	
}
