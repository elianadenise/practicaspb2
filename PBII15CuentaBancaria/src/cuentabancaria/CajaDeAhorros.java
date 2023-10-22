package cuentabancaria;

public class CajaDeAhorros extends CuentaBancaria{

	private Double costoAdicionalPorExtraccion;
	private Integer contadorExtraccion;
	private final Integer MAXIMO_EXTRACCION_SIN_ADICIONAL;
	
	public CajaDeAhorros() {
		super();
		this.costoAdicionalPorExtraccion = 6.00;
		this.contadorExtraccion = 0;
		this.MAXIMO_EXTRACCION_SIN_ADICIONAL = 5;
	}
	
	@Override
	public Boolean extraer(Double monto) throws SaldoInsuficiente {
		if(this.contadorExtraccion < this.MAXIMO_EXTRACCION_SIN_ADICIONAL && monto <= this.saldo) {
			this.saldo = this.saldo - monto;
			this.contadorExtraccion++;
			return true;
		} else if(this.contadorExtraccion >= this.MAXIMO_EXTRACCION_SIN_ADICIONAL && (monto + this.costoAdicionalPorExtraccion) <= this.saldo) {
			this.saldo = this.saldo - monto - this.costoAdicionalPorExtraccion;
			return true;
		} 
		throw new SaldoInsuficiente();
		//return false;
	}

	public Integer getContadorExtraccion() {
		return contadorExtraccion;
	}

	public Double getCostoAdicionalPorExtraccion() {
		return costoAdicionalPorExtraccion;
	}
	
}
