package listaDuplaEncadeada;

public class ListaDuplamenteEncadeada<T> {
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.tamanhoLista = 0;
		this.primeiroNo = null;
		this.ultimoNo = null;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	private NoDuplo<T> getNo(int index) {
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	public T get(int index) {
		
		return this.getNo(index).getConteudo();
	}
	
	public void add(T conteudo) {
		NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;
		
	}
	
	
	
	public void add(int index, T conteudo) {
		
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
		novoNo.setNoProximo(noAuxiliar);
		if(noAuxiliar !=null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			noAuxiliar.setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo =novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		
		
		tamanhoLista++;
		
	}
	
	public void remove(int index) {
		
		if(index ==0) {
			
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}else {
				System.err.println("O próximo nó é null");
			}
			
			
			
		}else {
			
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar.getNoPrevio();
				
			}
			
			
			
		}
				
		this.tamanhoLista--;
	}

	@Override
	public String toString() {
		
		String strRetorno ="";
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			strRetorno += "No {conteudo = "+noAuxiliar.getConteudo()+"} -->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += "null";
		return strRetorno;
	}
	
	
	
	
	
	
	
	
	
	
	
}
