package clubDeDeportes;

import java.util.*;

import enumeradores.TipoDeEvento;

public class Club {

	
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private int contadorDeEventos;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new TreeSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
		this.contadorDeEventos = 0;
	}
	
	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}
	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) {
		Evento eventoBuscado = this.competencias.get(nombreEvento);
		if(eventoBuscado != null) {
			if ((eventoBuscado.getTipo().equals(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS) || eventoBuscado.getTipo().equals(TipoDeEvento.CARRERA_NATACION_EN_PICINA)) &&
				    (deportista instanceof Triatleta || deportista instanceof Corredor)) {
				    eventoBuscado.getParticipantes().put(1, deportista);
				    return eventoBuscado.cantidadDeParticipantes();
				}
		}
		
		return null;
	}
	public void crearEvento(TipoDeEvento tipo, String nombreEvento) {
		this.contadorDeEventos++;
		this.competencias.put(nombreEvento, new Evento(tipo, contadorDeEventos));
	} 
	
}