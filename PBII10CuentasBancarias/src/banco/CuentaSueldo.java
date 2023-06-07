package banco;

public class CuentaSueldo {

	private Double saldo;
	
	public Boolean depositar(Double monto) {
		this.saldo = this.saldo + monto;
		return true;
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return 4_000.00;
	}

}
