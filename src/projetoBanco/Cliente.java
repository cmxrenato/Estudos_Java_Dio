package projetoBanco;

public class Cliente extends Banco {
	private Integer contaCorrente;
	private String cliente;
	private Double saldoCC;
	
	public Cliente(String cliente) {
		
		this.cliente = cliente;
		this.contaCorrente = contador++;
		this.saldoCC = 0.0;
		// TODO Auto-generated constructor stub
	}
	public String getCliente() {
		return cliente;
	}
	
	public Integer getContaCorrente() {
	return contaCorrente;
	}
	public Double getSaldoCC() {
		return saldoCC;
	}
	
	public Double sacar(Double valor) {
		
		saldoCC = getSaldoCC() - valor;
		
		
		return saldoCC;
		
	}
	
	public Double depositar(Double valor) {
		
		saldoCC = getSaldoCC() + valor;
		
		
		return saldoCC;
	}
	
	public void transferir(Cliente cliente, Double valor) {
		saldoCC = getSaldoCC() - valor;
		cliente.saldoCC = cliente.getSaldoCC() + valor;
		
	}


}
