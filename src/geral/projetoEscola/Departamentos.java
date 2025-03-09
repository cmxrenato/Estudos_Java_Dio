package geral.projetoEscola;

public class Departamentos {
	private String nomeDepartamento;
	
	public Departamentos(String nome) {
		this.nomeDepartamento = nome;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	@Override
	public String toString() {
		return "Departamentos [nomeDepartamento=" + nomeDepartamento + "]";
	}
	
	
}
