package hogwarts;

public class Expelliarmus extends Hechizo {

	public Expelliarmus() {
		super("expelliarmus");
	}

	@Override
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.desarmar();
	}

}
