package geral.projetoEscola;

public class Aluno {

	private String nome;
	private int cpf;
	private int idade;
	
	
	public Aluno(String nome, int cpf, int idade) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	
	
}
