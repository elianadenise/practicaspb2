package facturasParcial;

public abstract class Articulo {

	protected String nombreProducto;
	protected Integer cantidadUnidades;
	protected Double precioUnitario;
	protected Double precioTotalPorArticulo;
	public Articulo(String nombreProducto, Integer cantidadUnidades, Double precioUnitario,
			Double precioTotalPorArticulo) {
		this.nombreProducto = nombreProducto;
		this.cantidadUnidades = cantidadUnidades;
		this.precioUnitario = precioUnitario;
		this.precioTotalPorArticulo = precioTotalPorArticulo;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public Integer getCantidadUnidades() {
		return cantidadUnidades;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public Double getPrecioTotalPorArticulo() {
		return precioTotalPorArticulo;
	}
	@Override
	public String toString() {
		return "Articulo [nombreProducto=" + nombreProducto + ", cantidadUnidades=" + cantidadUnidades
				+ ", precioUnitario=" + precioUnitario + ", precioTotalPorArticulo=" + precioTotalPorArticulo + "]";
	}
	
	
	
}
