package coleccionesAvanzadasJuanMa;
import java.util.*;

public class Tablero {

	private List<Tarea> tareas;
	private HashSet<Usuario> usuarios;
	
	public Tablero() {
		this.tareas = new ArrayList<Tarea>();
		this.usuarios = new HashSet<Usuario>();
	}
	
	public Boolean agregarTarea(Tarea tarea) {
		if(this.usuarios.contains(tarea.getCreador())) {
			return this.tareas.add(tarea);
		}
		return Boolean.FALSE;
	}
	
	public Boolean agregarUsuario(Usuario usuario) {
		return this.usuarios.add(usuario);
	}
	
	public ArrayList<Tarea> tareasPendientes(){
		ArrayList<Tarea> pendientes = new ArrayList<Tarea>();
		for(Tarea t: this.tareas) {
			if(t.getEstado().equals(EstadoDeLaTarea.PENDIENTE)) {
				pendientes.add(t);
			}
		}
		return pendientes;
	}
	
	public ArrayList<Tarea> tareasEnCurso(){
		ArrayList<Tarea> enCurso = new ArrayList<Tarea>();
		for(Tarea t: this.tareas) {
			if(t.getEstado().equals(EstadoDeLaTarea.EN_CURSO)) {
				enCurso.add(t);
			}
		}
		return enCurso;
	}
	
	public ArrayList<Tarea> tareasFinalizada(){
		ArrayList<Tarea> finalizada = new ArrayList<Tarea>();
		for(Tarea t: this.tareas) {
			if(t.getEstado().equals(EstadoDeLaTarea.FINALIZADA)) {
				finalizada.add(t);
			}
		}
		return finalizada;
	}
}
