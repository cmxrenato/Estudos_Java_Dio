package listasEncadeadas;

public class ListaEncadeada<T> {

	private No<T> refEntrada;
	
	public ListaEncadeada() {
		this.refEntrada = null;
	}
	
	public boolean isEmpty() {
		return refEntrada == null;
	}
	
	public T get(int index) {
		
		
		return getNo(index).getConteudo();
		
	}
	
	public T remove(int index) {
		No<T> noAlvo = this.getNo(index);
		if (index == 0) {
			refEntrada = noAlvo.getProximoNo();
			
			return noAlvo.getConteudo();
	}
		No<T> noAnterior = getNo(index -1);
		noAnterior.setProximoNo(noAlvo.getProximoNo());
		return noAlvo.getConteudo();
	}
	
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		No<T> noAuxiliar = refEntrada;
		
		No<T> noRetorno = null;
		for(int i =0; i <= index;i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpty()) {
			refEntrada = novoNo;
			return;
		}else {
			No<T> noAuxiliar = refEntrada;
			for(int i =0; i < this.size()-1;i++) {
				noAuxiliar = noAuxiliar.getProximoNo();
			}
			noAuxiliar.setProximoNo(novoNo);
		}
	}
	
	public void append(T conteudo, Integer index) {
	    
	        No<T> noIndex = getNo(index); // Obtém o nó no índice especificado
	        noIndex.setConteudo(conteudo);
	    }
	

	
	public int size() {
		int tamanhoLista = 0;
		No<T> refAuxiliar = refEntrada;
		
		while(true) {
			if(refAuxiliar != null) {
				tamanhoLista++;
				if(refAuxiliar.getProximoNo()!= null) {
					refAuxiliar = refAuxiliar.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	private void validaIndice(int index) {
		
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo para esse índice!");
		}
	}

	@Override
	public String toString() {
		
		String strRetorno = "ListaEncadeada ";
		No<T> noAuxiliar = refEntrada;
		
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[conteudo=" + noAuxiliar.getConteudo() + "]---->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		strRetorno += "null";
		
		
		return strRetorno;
	}
	
}
