package cuentabancaria;

public abstract class CuentaBancaria {

	protected Double saldo;

	public CuentaBancaria() {
		this.saldo = 0.0;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	// metodos
	public Boolean depositar(Double monto) {
		this.saldo = saldo + monto;
		return true;
	}
	
	public abstract Boolean extraer(Double monto) throws SaldoInsuficiente ;
	
}
