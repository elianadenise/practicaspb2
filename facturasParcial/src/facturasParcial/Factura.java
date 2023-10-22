package facturasParcial;
import java.util.*;
public class Factura {

	private Set<Articulo> lineas;
	
	public Factura() {
		this.lineas = new LinkedHashSet<Articulo>();
	}
	
	private Boolean agregarLinea(Articulo articulo) {
		return this.lineas.add(articulo);
	}
	
	private Integer cantidadDeLineas() {
		return this.lineas.size();
	}
	
	private Double pedirImpuestoSobreArticuloNormal(Articulo articulo) {
		if(this.lineas.contains(articulo) && articulo instanceof ArticuloNormal) {
			return articulo.getPrecioUnitario() * 0.15;
		}
		return null;
	}
}
