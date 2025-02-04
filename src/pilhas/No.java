package pilhas;

public class No<T> {
	
	private T dado;
	private No<T> refNo; //endereco de referência do nó debaixo.
	
	public No(T dado) {
		
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
	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
		this.refNo = refNo;
	} 

	@Override
	public String toString() {
		return "No [Referencia=" + dado + "]";
	}


	
	
	
	
	
}
