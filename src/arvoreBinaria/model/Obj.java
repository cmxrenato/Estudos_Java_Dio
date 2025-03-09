package arvoreBinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

	Integer meuValor;

	public Obj(Integer meuValor) {
		
		this.meuValor = meuValor;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Obj obj = (Obj) o;
		return Objects.equals(meuValor, obj.meuValor);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(meuValor);
	}

	@Override
	public int compareTo(Obj outro) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		if(this.meuValor > outro.meuValor) {
			i = 1;
		}else if(this.meuValor < outro.meuValor) {
			i = -1;
		}
		
		
		
		
		
		return i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return meuValor.toString();
	}

	

	
	
	
	
}
