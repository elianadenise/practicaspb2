package cuentaBancaria;

public abstract class CuentaBancaria {

	protected Integer cbu;
	protected Double saldo;

	public CuentaBancaria(Integer cbu) {
		this.cbu = cbu;
		this.saldo = 0.0;
	}

	public abstract Boolean extraer(Double monto) throws NoPoseeSaldoDisponible;

	public void depositar(Double monto) {
		this.saldo += monto;
	}

	public void transferir(CuentaBancaria cuenta, Double monto) throws NoPoseeSaldoDisponible {
		if (this.extraer(monto)) {
			cuenta.depositar(monto);
		}
		throw new NoPoseeSaldoDisponible(this.cbu + " no puede realizar transferencia por falta de fondos.");
	}

	public Integer getCbu() {
		return cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

}
