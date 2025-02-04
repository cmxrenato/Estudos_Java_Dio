package com.padrao.pilhas;

public class No {
	
	private int dado;
	private No refNo = null; //endereco de referência do nó debaixo.
	
	public No(int dado) {
		
		this.dado = dado;
		this.refNo = null; // Ao criar um nó, ele não aponta para nenhum outro
	}
	
	
	/*
	private Object dado;
    private No refNo; // Referência para o próximo nó na pilha

    // Construtor para inicializar o nó com um dado
    public No(Object dado) {
        this.dado = dado;
        this.refNo = null; // Ao criar um nó, ele não aponta para nenhum outro
    }
*/
	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	} 

	@Override
	public String toString() {
		return "No [Referencia=" + dado + "]";
	}


	
	
	
	
	
}
