package geral;




import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Os 20 primeiros números de fibonacci: ");
		
		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(1);
		int atual = 1;
		int anterior = 0;
		int proximo;
		
		
		for (int i = 0; i < 19; i++) {
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
			fibo.add(proximo);
		
			
			
		}
		
		
		System.out.println(fibo);
		System.out.println(fibo);
		
		
		
	
		
		

	}

}
