package model;

public class Compra {
	private int clienteId;
	private int codigoCompra;
	private String dataCompra;
	
	
	public int getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public int getCodigoCompra() {
		return codigoCompra;
	}
	public void setCodigoCompra(int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
}
