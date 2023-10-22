package sangucheto;
import java.util.*;
public class Sangucheto {

	private HashSet<Alimento> disponibles;
	private HashSet<Alimento> noDisponibles;
	private List<Ingrediente> ingredientesEnElSangucheto;
	private List<Condimento> condimentoEnElSangucheto;
	
	public Sangucheto() {
		this.disponibles = new HashSet<Alimento>();
		this.noDisponibles = new HashSet<Alimento>();
		this.ingredientesEnElSangucheto = new LinkedList<Ingrediente>();
		this.condimentoEnElSangucheto = new LinkedList<Condimento>();
	}
	
	// 1
	public Boolean agregarIngredienteASangucheto(Ingrediente ingrediente) {
		if(this.disponibles.contains(ingrediente)) {
			for(Alimento a : disponibles) {
				if(a == ingrediente) {
					a.setCantidadEnStock(a.getCantidadEnStock() - 1);
				}
			}
			return this.ingredientesEnElSangucheto.add(ingrediente);
		}
		return Boolean.FALSE;
	}
	
	public Boolean agregarCondimentoASangucheto(Condimento condimento) {
		if(this.disponibles.contains(condimento)) {
			for(Alimento a : disponibles) {
				if(a == condimento) {
					a.setCantidadEnStock(a.getCantidadEnStock() - 1);
				}
			}
			return this.condimentoEnElSangucheto.add(condimento);
		}
		return Boolean.FALSE;
	}
	
	public String listarIngredientesDelSangucheto() {
		String listado = "";
		for(Ingrediente i : this.ingredientesEnElSangucheto) {
			listado += i.toString();
		}
		return listado;
	}
	
	public String listarCondimentosDelSangucheto() {
		String listado = "";
		for(Condimento c : this.condimentoEnElSangucheto) {
			listado += c.toString();
		}
		return listado;
	}
	
	public Double consultarPrecioTotalSangucheto() {
		Double precioIngrediente = 0.0;
		Double precioCondimento = 0.0;
		for(Ingrediente i : this.ingredientesEnElSangucheto) {
			precioIngrediente += i.getPrecio();
		}
		for(Condimento c : this.condimentoEnElSangucheto) {
			precioCondimento += c.getPrecio();
		}
		return precioIngrediente + precioCondimento;
	}
	
	public Boolean cancelarPedido() {
		
		return (this.ingredientesEnElSangucheto.removeAll(this.ingredientesEnElSangucheto))
				&& (this.condimentoEnElSangucheto.removeAll(this.condimentoEnElSangucheto));
	}
	
	// 2
	public String listarAlimentoDisponibles() {
		String listado = "";
		for(Alimento a : disponibles) {
			if(a.getCantidadEnStock() > 0) {
				listado += a +", ";
			}
		}
		return listado;
	}
	
	// 3
	public String consultarStockDeTodosLosAlimentos() {
		String listado = "";
		for(Alimento a : disponibles) {
				listado += a.alimentosYStock() +", ";
		}
		return listado;
	}
	
	// 4
	public Boolean darAltaAlimento(Alimento alimento) {
		return this.disponibles.add(alimento);
	}
	
	// 5
	public Boolean agregarStock(String alimento, Integer cantidad) {
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento)) {
				a.agregarStock(cantidad);
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	// 6
	public Integer obtenerStockDeAlimento(String alimento) {
		Integer stock = 0;
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento)) {
				stock = a.getCantidadEnStock();
			}
		}
		return stock;
	}
	
	// 7
	public Boolean determinarExistenciaAlimento(String alimento) {
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento) && a.getCantidadEnStock() > 0) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	// 8
	public Boolean comprarAlimento(String alimento, Integer cantidad) {
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento)) {
				if(a.getCantidadEnStock() - cantidad > 0) {
					a.setCantidadEnStock(a.getCantidadEnStock() - cantidad);
					return Boolean.TRUE;
				}
			}
		}
		return Boolean.FALSE;
	}
	
	// 9
	public Boolean eliminarStockDeAlimento(String alimento) {
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento)) {
				a.eliminarStock();
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	// 10
	public Boolean eliminarAlimento(String alimento) {
		for(Alimento a : disponibles) {
			if(a.getNombre().equals(alimento)) {
				this.noDisponibles.add(a);
				return this.disponibles.remove(a);
			}
		}
		return Boolean.FALSE;
	}

	public Integer cantidadDisponibles() {
		return this.disponibles.size();
	}
	public Integer cantidadNoDisponibles() {
		return this.noDisponibles.size();
	}
	public Integer cantiadadIngredientes() {
		return this.ingredientesEnElSangucheto.size();
	}
	public Integer cantiadadCondimentos() {
		return this.condimentoEnElSangucheto.size();
	}
}
