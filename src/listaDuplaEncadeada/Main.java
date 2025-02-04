package listaDuplaEncadeada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListaDuplamenteEncadeada<String> listaDupla = new ListaDuplamenteEncadeada<String>();
		
		
		listaDupla.add("0");
		listaDupla.add("1");
		listaDupla.add("2");
		listaDupla.add("3");
		
		
		
		
		System.out.println(listaDupla);
		listaDupla.remove(3);
		System.out.println(listaDupla);
		
	}

}
