package sangucheto;

public class Condimento extends Alimento{

	public Condimento(String nombre, Double precio) {
		super(nombre, precio);
		this.esCondimento = Boolean.TRUE;
	}
	
}
