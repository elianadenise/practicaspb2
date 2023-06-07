package futsal;

public class Equipo {

	private String nombre;
	private Jugador jugadores [];
	private final Integer CANTIDAD_JUGADORES;
	private Integer indiceJugadores;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.CANTIDAD_JUGADORES = 5;
		this.jugadores = new Jugador [this.CANTIDAD_JUGADORES];
		this.indiceJugadores = 0;
	}

	public Boolean agregarJugador(Jugador nuevo) {
		jugadores[indiceJugadores++] = nuevo;
		return true;
	}

	public Integer getIndiceJugadores() {
		return this.indiceJugadores;
	}

}
