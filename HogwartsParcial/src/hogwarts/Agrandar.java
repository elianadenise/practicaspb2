package hogwarts;

public class Agrandar extends Hechizo {

	public Agrandar(String nombre) {
		super(nombre);
	}

	@Override
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.agrandar();
	}

}
