package listaCircular;

public class ListaCircular<T> {
	
	private No<T> noCabeca;
	private No<T> noCauda;
	private int tamanhoLista;
	
	
	public ListaCircular() {
		this.tamanhoLista = 0;
		this.noCabeca = null;
		this.noCauda = null;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true:false;
	}
	
	
	
	public void add(T conteudo) {
		
		No<T> novoNo = new No<>(conteudo);
		
		if(this.tamanhoLista == 0) {
			this.noCabeca = novoNo;
			this.noCauda = this.noCabeca;
			this.noCabeca.setNoProximo(this.noCauda);
		}else {
			novoNo.setNoProximo(this.noCauda);
			this.noCabeca.setNoProximo(novoNo);
			this.noCauda = novoNo;
		}
		
		this.tamanhoLista++;
	}
	
	
	
	
	
	private No<T> getNo(int index){
		
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("A lista está vazia");
		}
		
		if(index == 0) {
			return this.noCauda;
		}
		
		No<T> noAuxiliar = this.noCauda;
		
		for(int i = 0; (i<index); i++) {
			
			noAuxiliar = noAuxiliar.getNoProximo();
			
			
		}
		
		return noAuxiliar;
		
  	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void remove(int index) {
		if(index >= this.tamanhoLista) {
			throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
		}
		
		No<T> noAuxiliar = this.noCauda;
		if(index == 0) {
			this.noCauda = this.noCauda.getNoProximo();
			this.noCabeca.setNoProximo(this.noCauda);
		}else {
			for(int i = 0; i < index-1; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
			
		}
		
		this.tamanhoLista--;
	}

	@Override
	public String toString() {
		
		String strRetorno ="";
		
		No<T> noAuxiliar = this.noCauda;
		
		for(int i = 0; i < size(); i++) {
			
			strRetorno += "{Nó[conteudo= "+noAuxiliar.getConteudo()+"]}-->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		strRetorno += this.isEmpty() ?"[Lista vazia]":"(Retorna ao início)";
		
		return strRetorno;
	}
	
	
	
	
	
	
	

}
