package com.padrao.pilhas;

public class Pilha {

	private No refNoEntradaPilha;

	public Pilha() {
		
		this.refNoEntradaPilha = null;
	}
	
	
	public No top() {
		return refNoEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha; //referencia do topo
		refNoEntradaPilha = novoNo; // recebe o novo dado
		refNoEntradaPilha.setRefNo(refAuxiliar); // referencia o próximo nó como o de baixo.
	}
	
	public No pop() {
		if(this.isEmpty()) {
			return null;
		}
		No noPoped = refNoEntradaPilha; // o nó popado recebe o o nó topo
		refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // o novo topo referência
		 noPoped.setRefNo(null); // Desconecta o nó removido da pilha
		// para o nó debaixo.
		
		return noPoped;
		
	}
	
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true:false;
	}


	@Override
	public String toString() {
	    StringBuilder stringRetorno = new StringBuilder();
	    stringRetorno.append("------------------\n");
	    stringRetorno.append("      Pilha\n");
	    stringRetorno.append("---------------\n");

	    No noAuxiliar = refNoEntradaPilha;

	    while (noAuxiliar != null) {
	        stringRetorno.append("[No{dado=").append(noAuxiliar.getDado()).append("}]\n");
	        noAuxiliar = noAuxiliar.getRefNo();
	    }

	    stringRetorno.append("====================\n");
	    return stringRetorno.toString();
	}

	
	
}
