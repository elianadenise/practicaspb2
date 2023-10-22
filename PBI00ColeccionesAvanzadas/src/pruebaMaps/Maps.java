package pruebaMaps;
import java.util.*;
public class Maps {
	private Map<Integer, Persona> personas;
	public Maps() {
		this.personas = new TreeMap<Integer, Persona>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.put(persona.getDni(), persona);
	}
	
	public Integer cantidadDePersonas() {
		return this.personas.size();
	}
	
	public void eliminarPersonaPorDni(Integer dni) {
		this.personas.remove(dni);
	}

	public Map<Integer, Persona> getPersonas() {
		return personas;
	}
	
	
}
