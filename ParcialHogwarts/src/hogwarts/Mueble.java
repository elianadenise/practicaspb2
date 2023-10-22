package hogwarts;

public class Mueble implements Hechizable {

	private String estado;

	public Mueble() {
		this.estado = "";
	}

	public String getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	@Override
	public void desarmar() {
		this.estado = "Me desarmaron";
		
	}

	@Override
	public void agrandar() {
		this.estado = "Ahora soy más grande";
		
	}

}
