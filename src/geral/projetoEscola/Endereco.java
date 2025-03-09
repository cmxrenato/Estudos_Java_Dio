package geral.projetoEscola;

public class Endereco  {

	private String nome_rua;
	private int numeroEscola;
	
	public Endereco(String nome_rua, int numeroEscola) {
		
		this.nome_rua = nome_rua;
		this.numeroEscola = numeroEscola;
	}
	
	@Override
	public String toString() {
		return "Endereco [nome_rua=" + nome_rua + ", numeroEscola=" + numeroEscola + "]";
	}

	public String getNome_rua() {
		return nome_rua;
	}
	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}
	public int getNumeroEscola() {
		return numeroEscola;
	}
	public void setNumeroEscola(int numeroEscola) {
		this.numeroEscola = numeroEscola;
	}
	
	
	
	
}
