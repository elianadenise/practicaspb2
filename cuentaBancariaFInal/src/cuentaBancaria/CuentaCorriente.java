package cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {

	private Double porcentajeAdicional;
	private Double limiteAdicional;
	public CuentaCorriente(Integer cbu) {
		super(cbu);
		this.porcentajeAdicional = 0.05;
		this.limiteAdicional = 200.0;
	}

	@Override
	public Boolean extraer(Double monto) throws NoPoseeSaldoDisponible {
		if(this.saldo >= monto) {
			this.saldo -= monto;
			return Boolean.TRUE;
		} else if(this.saldo + this.limiteAdicional >= monto) {
			this.limiteAdicional -= (monto - this.saldo) + ((monto - this.saldo) * this.porcentajeAdicional);
			this.saldo = 0.0;
			return Boolean.TRUE;
		}
		throw new NoPoseeSaldoDisponible("No posee fondos para realizar la extraccion");
	}

	public Double getLimiteAdicional() {
		return limiteAdicional;
	}

	public void setLimiteAdicional(Double limiteAdicional) {
		this.limiteAdicional = limiteAdicional;
	}

}
