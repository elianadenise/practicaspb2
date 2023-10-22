package cuentaBancaria;

public class CajaDeAhorros extends CuentaBancaria {

	private Integer contadorDeExtracciones;
	private Integer LIMITE_EXTRACCION_SIN_ADICIONAL;
	private Double adicional;
	public CajaDeAhorros(Integer cbu) {
		super(cbu);
		this.contadorDeExtracciones = 0;
		this.LIMITE_EXTRACCION_SIN_ADICIONAL = 5;
		this.adicional = 6.0;
	}

	@Override
	public Boolean extraer(Double monto) throws NoPoseeSaldoDisponible {
		this.contadorDeExtracciones++;
		if(this.contadorDeExtracciones <= this.LIMITE_EXTRACCION_SIN_ADICIONAL && this.saldo >= monto) {
			this.saldo -= monto;
			
			return Boolean.TRUE;
		} else if(this.contadorDeExtracciones > this.LIMITE_EXTRACCION_SIN_ADICIONAL && this.saldo >= (monto + this.adicional)){
			this.saldo -= (monto + this.adicional);
			return Boolean.TRUE;
		}
		throw new NoPoseeSaldoDisponible("No posee fondos para realizar la extraccion");
	}

}
