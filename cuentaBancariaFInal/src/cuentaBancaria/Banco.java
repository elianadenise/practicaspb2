package cuentaBancaria;
import java.util.*;
public class Banco {

	private Map<Integer, CuentaBancaria> cuentas;
	private TreeSet<Transaccion> transacciones;
	
	public Banco() {
		this.cuentas = new TreeMap<Integer, CuentaBancaria>();
		this.transacciones = new TreeSet<Transaccion>();
	}
	
	public void agregarCuentaAlBanco(CuentaBancaria cuenta) {
		this.cuentas.put(cuenta.getCbu(), cuenta);
	}
	
	public void registroTransaccion(Transaccion transaccion) throws CuentaInexistente {
		if(transaccion.getMotivo().equals(TipoDeTransaccion.DEPOSITO) || transaccion.getMotivo().equals(TipoDeTransaccion.EXTRACCION)){
			if(cuentas.containsValue(transaccion.getOrigen())) {
				switch (transaccion.getMotivo()) {
				case DEPOSITO:
					transaccion.getOrigen().depositar(transaccion.getMonto());
					this.transacciones.add(transaccion);
					break;
				case EXTRACCION:
					try {
						transaccion.getOrigen().extraer(transaccion.getMonto());
						
					} catch (NoPoseeSaldoDisponible e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.transacciones.add(transaccion);
					break;
				default:
					break;
				}
			} else {
				throw new CuentaInexistente("Cuenta origen no existe");
			}
			
		} else if(transaccion.getMotivo().equals(TipoDeTransaccion.DEPOSITO)) {
			if(this.cuentas.containsValue(transaccion.getOrigen()) && this.cuentas.containsValue(transaccion.getDestino())) {
				try {
					transaccion.getOrigen().transferir(transaccion.getDestino(), transaccion.getMonto());
					
				} catch (NoPoseeSaldoDisponible e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.transacciones.add(transaccion);
			} else {
				throw new CuentaInexistente("Cuenta origen y/o destino no existen");
			}
			
		}
	}
	
	public Integer cantiadadCuentas() {
		return this.cuentas.size();
	}
	
	public Integer cantidadTransaccion() {
		return this.transacciones.size();
	}
}
