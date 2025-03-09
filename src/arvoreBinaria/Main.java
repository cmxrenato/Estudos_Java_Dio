package arvoreBinaria;

import arvoreBinaria.model.Obj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
		
		Obj a = new Obj(32);
		
		
		minhaArvore.inserir(new Obj(13));
		minhaArvore.inserir(new Obj(10));
		minhaArvore.inserir(new Obj(25));
		minhaArvore.inserir(new Obj(2));
		minhaArvore.inserir(new Obj(12));
		minhaArvore.inserir(new Obj(20));
		minhaArvore.inserir(new Obj(31));
		minhaArvore.inserir(new Obj(29));
		minhaArvore.inserir(a);
		minhaArvore.remove(a);
		
		minhaArvore.exibirInOrdem();
		minhaArvore.exibirPreOrdem();
		minhaArvore.exibirPosOrdem();
		
		
		
	}
	
	
}
