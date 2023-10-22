package hogwarts;

public class Mueble implements Hechizable {

	private String estado;

	public Mueble() {
		this.estado = "";
	}
	
	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	@Override
	public void desarmar() {
		// TODO Auto-generated method stub
		this.estado = "Me desarmaron";
	}

	@Override
	public void agrandar() {
		// TODO Auto-generated method stub
		this.estado = "Ahora soy más grande";
	}

}
