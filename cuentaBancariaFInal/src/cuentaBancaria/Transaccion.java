package cuentaBancaria;

public class Transaccion implements Comparable<Transaccion>{

	private CuentaBancaria origen;
	private CuentaBancaria destino;
	private TipoDeTransaccion motivo;
	private Double monto;
	private Integer id;
	public Transaccion(Integer id, CuentaBancaria origen, CuentaBancaria destino, TipoDeTransaccion motivo, Double monto) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.motivo = motivo;
		this.monto = monto;
	}
	public Transaccion(Integer id, CuentaBancaria origen, TipoDeTransaccion motivo, Double monto) {
		this.id = id;
		this.origen = origen;
		this.motivo = motivo;
		this.monto = monto;
	}
	public CuentaBancaria getOrigen() {
		return origen;
	}
	public void setOrigen(CuentaBancaria origen) {
		this.origen = origen;
	}
	public CuentaBancaria getDestino() {
		return destino;
	}
	public void setDestino(CuentaBancaria destino) {
		this.destino = destino;
	}
	public TipoDeTransaccion getMotivo() {
		return motivo;
	}
	public void setMotivo(TipoDeTransaccion motivo) {
		this.motivo = motivo;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	@Override
	public int compareTo(Transaccion o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
