package filas.refatoracaoGenerics;


public class Fila<T> {
	private No<T> noRef;

	public Fila() {
		
		this.noRef = null;
	}
	
	public boolean isEmpty() {
		return noRef == null;
	}
	/*
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refEntradaFila); //A referência do novo nó aponta para o que era o último nó.
		refEntradaFila = novoNo; // A referência de entrada agora é o novoNo, o último da fila.
	}*/
	
	public void enqueue(T object) {
		No<T> novoNo = new No<T>(object);
		novoNo.setRefNo(noRef); //A referência do novo nó aponta para o que era o último nó.
		noRef = novoNo; // A referência de entrada agora é o novoNo, o último da fila.
	}
	/*
	public No first() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntradaFila;
			while(primeiroNo.getRefNo() != null) {
				primeiroNo = primeiroNo.getRefNo();
			}
			return primeiroNo;
		}
		return null;
	}*/
	
	public T first() {
		if(!this.isEmpty()) {
			No<T> noAuxiliar = noRef;
			while(noAuxiliar.getRefNo() != null) {
				noAuxiliar = noAuxiliar.getRefNo();
			}
			return noAuxiliar.getObject();
		}
		return null;
	}
	
	
	
	
	
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = noRef;
			No<T> noAuxiliar = noRef;

			if (primeiroNo.getRefNo() == null) { 
				noRef = null; // não tem mais nó na fila.
				System.err.println("Já não existe mais nó");
				return primeiroNo.getObject();
			}

			while(primeiroNo.getRefNo() != null) {
				noAuxiliar = primeiroNo;
				primeiroNo = primeiroNo.getRefNo();
			}
			noAuxiliar.setRefNo(null);
			return noAuxiliar.getObject();
		}
		return null;
	}
	

	@Override
	public String toString() {
	    StringBuilder stringRetorno = new StringBuilder();
	    stringRetorno.append("------------------\n");
	    stringRetorno.append("      Fila\n");
	    stringRetorno.append("---------------\n");

	    No<T> noAuxiliar = noRef;
	    
	    

	    while (noRef != null) {
	        stringRetorno.append("[No{dado=").append(noAuxiliar.getObject()).append("}]--->");
	        noAuxiliar = noAuxiliar.getRefNo();
	        
	        if(noAuxiliar == null) {
	        	break;
	        }
	    }
	    

	    stringRetorno.append("null");
	    return stringRetorno.toString();
	}

}
