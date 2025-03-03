package geral.projetoEscola;

import java.util.Arrays;

public class Escola  {
    //Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private Departamentos departamentos [];
    private Aluno discentes [];
    private int nr_discentes , nr_departamentos;
 
    //Métodos
    public Escola ( String nome , String CNPJ) {
    	
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamentos[3];
        this.discentes = new Aluno[5];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
        
    }
    
    public String getNome() {
		return nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public Endereco setEndereco(String nome, int numero) {
		Endereco endereco = new Endereco(nome,numero);
		return this.endereco = endereco;
	}

	public Departamentos[] getDepartamentos() {
		for (Departamentos a : departamentos) {
	        System.out.println(a);
	    }
		return departamentos;
	}

	public Aluno[] getDiscentes() {
	    for (Aluno a : discentes) {
	        System.out.println(a);
	    }
	    return discentes;
	}

	public int getNr_discentes() {
		return nr_discentes;
	}

	public int getNr_departamentos() {
		return nr_departamentos;
	}

	public void criarDepartamento(String nomeDepartamento){
        if(nr_departamentos < 3)
        {
            departamentos[nr_departamentos] = new Departamentos(nomeDepartamento);                
            nr_departamentos++;
        } else {
            System.out.println( "Nao e possivel criar outro Departamento." );
            }
       }
    public void matricularAluno ( Aluno novoAluno ) {
    	if(nr_discentes < 5) {
    	
       discentes [ nr_discentes ] = novoAluno;
       nr_discentes++;
       
    }else {
    	System.out.println("Não é possível matricular mais ninguém!");
    }
    	
    	
    	
}

	@Override
	public String toString() {
		return "Escola [nome=" + nome + ", CNPJ=" + CNPJ + ", endereco=" + endereco + ", departamentos="
				+ Arrays.toString(departamentos) + ", discentes=" + Arrays.toString(discentes) + ", nr_discentes="
				+ nr_discentes + ", nr_departamentos=" + nr_departamentos + "]";
	}}