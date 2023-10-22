package callcenter;

public class Contacto {

	private Boolean esCliente;
	private Boolean deseaSerLlamado;
	private String nombreYApellido;
	private String celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Llamada llamadasRecibidas[];
	private final Integer CANTIDAD_MAXIMA_LLAMADAS;
	private Integer cantidadDeLlamadasRecibidas;
	
	public Contacto() {
		this.esCliente = false;
		this.deseaSerLlamado = true;
		this.CANTIDAD_MAXIMA_LLAMADAS = 100;
		this.cantidadDeLlamadasRecibidas = 0;
		
	}
	public Contacto(String nombreYApellido, String celular, String email,
			String direccion, Integer codigoPostal, String localidad, Provincia provincia) {
		this.esCliente = false;
		this.deseaSerLlamado = true;
		this.nombreYApellido = nombreYApellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.CANTIDAD_MAXIMA_LLAMADAS = 100;
		this.cantidadDeLlamadasRecibidas = 0;
		llamadasRecibidas = new Llamada[CANTIDAD_MAXIMA_LLAMADAS];
		
	}

	public Boolean getEsCliente() {
		return esCliente;
	}
	public Boolean getDeseaSerLlamado() {
		return deseaSerLlamado;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}
	public void setDeseaSerLlamado(Boolean deseaSerLlamado) {
		this.deseaSerLlamado = deseaSerLlamado;
	}
	
	public Llamada[] getLlamadasRecibidas() {
		return llamadasRecibidas;
	}
	public void setLlamadasRecibidas(Llamada[] llamadasRecibidas) {
		this.llamadasRecibidas = llamadasRecibidas;
	}	
	public Integer getCantidadDeLlamadasRecibidas() {
		return cantidadDeLlamadasRecibidas;
	}
	public void setCantidadDeLlamadasRecibidas(Integer cantidadDeLlamadasRecibidas) {
		this.cantidadDeLlamadasRecibidas = cantidadDeLlamadasRecibidas;
	}
	
	// metodos
	public void llamar(Llamada nueva) {
		llamadasRecibidas[cantidadDeLlamadasRecibidas++] = nueva;
	}
	
	public static Boolean esUnEmailValido(String emailIngresado) { // STATIC porque no necesariamente necesito que se inicialice el objeto
		if(emailIngresado.contains("@") && emailIngresado.contains(".")) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean registrarNuevaLlamada(Boolean fueExitosa, String observaciones) {
		Llamada nueva = new Llamada(fueExitosa, observaciones);
		llamadasRecibidas[this.cantidadDeLlamadasRecibidas++] = nueva;
		return true;
	}
}
