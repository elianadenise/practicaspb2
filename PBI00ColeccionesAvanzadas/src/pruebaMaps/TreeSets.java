package pruebaMaps;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	private Set<Persona> personas;
	public TreeSets() {
		this.personas = new TreeSet<Persona>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public Integer cantidadDePersonas() {
		return this.personas.size();
	}
	
	public void eliminarPersonaPorDni(Persona persona) {
		this.personas.remove(persona);
	}

	public Set<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	
}
