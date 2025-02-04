package filas;



public class Fila {
	
	private No refEntradaFila;

	public Fila() {
		
		this.refEntradaFila = null;
	}
	
	public boolean isEmpty() {
		return refEntradaFila == null;
	}
	/*
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refEntradaFila); //A referência do novo nó aponta para o que era o último nó.
		refEntradaFila = novoNo; // A referência de entrada agora é o novoNo, o último da fila.
	}*/
	
	public void enqueue(Object object) {
		No novoNo = new No(object);
		novoNo.setRefNo(refEntradaFila); //A referência do novo nó aponta para o que era o último nó.
		refEntradaFila = novoNo; // A referência de entrada agora é o novoNo, o último da fila.
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
	
	public Object first() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntradaFila;
			while(primeiroNo.getRefNo() != null) {
				primeiroNo = primeiroNo.getRefNo();
			}
			return primeiroNo.getObject();
		}
		return null;
	}
	
	
	public Object dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntradaFila;
			No noAuxiliar = refEntradaFila;

			if (primeiroNo.getRefNo() == null) { 
				refEntradaFila = null; // não tem mais nó na fila.
				return primeiroNo;
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

	    No noAuxiliar = refEntradaFila;
	    
	    

	    while (refEntradaFila != null) {
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
