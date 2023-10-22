package sangucheto;

public class Ingrediente extends Alimento{

	public Ingrediente(String nombre, Double precio) {
		super(nombre, precio);
		this.esCondimento = Boolean.FALSE;
	}
}
