package Stream.estudos.projetinho1;
import java.util.*;
import java.util.stream.*;

public class Pessoa{
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		//super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade;
	}
	
		
}