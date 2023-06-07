package cuentabancaria;

public class CuentaCorriente extends CuentaBancaria{

	private Double comision;
	private Double montoDescubierto;
	private Double deuda;
	
	public CuentaCorriente() {
		super();
		this.comision = 0.05;
		this.montoDescubierto = 100.00;
		this.deuda = 0.0;
	}
	
	public Boolean extraer(Double monto) {
		if(this.saldo >= monto) {
			this.saldo = this.saldo - monto;
			return true;
		} else if(this.saldo < monto && this.saldo + this.montoDescubierto >= monto) {
			Double auxiliar = 0.0;
			auxiliar = monto - this.saldo;
			this.saldo = 0.0;
			this.deuda = (this.montoDescubierto) - (this.montoDescubierto - auxiliar - auxiliar * this.comision);
			this.montoDescubierto = this.montoDescubierto - auxiliar;
			return true;
		} else if(this.saldo + this.montoDescubierto <= monto) {
			return false;
		}
		return false;
	}

	public Double getDeuda() {
		return deuda;
	}
	
}
