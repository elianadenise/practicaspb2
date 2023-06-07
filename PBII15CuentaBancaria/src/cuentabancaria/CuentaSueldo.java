package cuentabancaria;

public class CuentaSueldo extends CuentaBancaria{

	public CuentaSueldo() {
		super();
	}
	
	// metodos
	public Boolean extraer(Double monto) {
		if(monto <= this.saldo) {
			this.saldo = this.saldo - monto;
			return true;
		} else {
			return false;
		}
	}
	
}
