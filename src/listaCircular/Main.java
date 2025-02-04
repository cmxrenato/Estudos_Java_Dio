package listaCircular;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaCircular<String> listaCircular = new ListaCircular<String>();
		
		listaCircular.add("ind4");
		/*
		listaCircular.add("ind3");
		listaCircular.add("ind2");
		listaCircular.add("ind1");
		listaCircular.add("ind0");
		*/
		
		listaCircular.remove(2);
		
		System.out.println(listaCircular);
		//
		//System.out.println(listaCircular);
		/*
		for(int i = 0; i<20; i++) {
			System.out.println(listaCircular.get(i));
		}*/
		
	}

}
