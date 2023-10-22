package cuentaBancaria;

public class CuentaSueldo extends CuentaBancaria{

	public CuentaSueldo(Integer cbu) {
		super(cbu);
	}

	@Override
	public Boolean extraer(Double monto) throws NoPoseeSaldoDisponible {
		if(this.saldo >= monto) {
			this.saldo -= monto;
			return Boolean.TRUE;
		}
		throw new NoPoseeSaldoDisponible("No posee fondos para realizar la extraccion");
	}
}
