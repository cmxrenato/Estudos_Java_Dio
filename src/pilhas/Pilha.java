package pilhas;

import filas.refatoracaoGenerics.No;

public class Pilha<T> {

	private No<T> ultimoNo;
	
	public Pilha() {
		
		this.ultimoNo = null;
	}
	
	public T first() {
		if(!this.isEmpty()) {
			
			No<T> noAuxiliar = ultimoNo;
			while(noAuxiliar.getRefNo() != null) {
				noAuxiliar = noAuxiliar.getRefNo();
			}
			return noAuxiliar.getObject();
		}
		return null;
	}
	
	public No<T> top() {
		return ultimoNo;
	}
	
	public void push(T Obj) {
		No<T> novoNo = new No<T>(Obj);
		No<T> refAuxiliar = ultimoNo; //referência do topo
		ultimoNo = (No<T>) novoNo; // recebe o novo dado
		ultimoNo.setRefNo(refAuxiliar); // referencia o próximo nó como o de baixo.
	}
	
	public No<T> pop() {
		if(this.isEmpty()) {
			return null;
		}
		No<T> noPoped = ultimoNo; // o nó popado recebe o o nó topo
		ultimoNo = ultimoNo.getRefNo(); // o novo topo referência
		 noPoped.setRefNo(null); // Desconecta o nó removido da pilha
		// para o nó debaixo.
		
		return noPoped;
		
	}
	
	public boolean isEmpty() {
		return ultimoNo == null ? true:false;
	}


	@Override
	public String toString() {
	    StringBuilder stringRetorno = new StringBuilder();
	    stringRetorno.append("------------------\n");
	    stringRetorno.append("      Pilha\n");
	    stringRetorno.append("---------------\n");

	    No<T> noAuxiliar = ultimoNo;

	    while (noAuxiliar != null) {
	        stringRetorno.append("[No{dado=").append(noAuxiliar.getObject()).append("}]\n");
	        noAuxiliar = noAuxiliar.getRefNo();
	    }

	    stringRetorno.append("====================\n");
	    return stringRetorno.toString();
	}

	
	
}
