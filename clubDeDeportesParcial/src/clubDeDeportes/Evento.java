package clubDeDeportes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

import enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion) {
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = new HashMap<Integer, Deportista>();
	}
	
	public Boolean inscribirDeportista(Deportista deportista) throws NoEstaPreparado {
		if ((tipo.equals(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS) || tipo.equals(TipoDeEvento.CARRERA_NATACION_EN_PICINA)) &&
			    (deportista instanceof Triatleta || deportista instanceof Corredor)) {
			    return Boolean.TRUE;
			}
		throw new NoEstaPreparado("No esta preparado");
	}
	
	public Integer cantidadDeParticipantes() {
		return this.participantes.size();
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	
	
}