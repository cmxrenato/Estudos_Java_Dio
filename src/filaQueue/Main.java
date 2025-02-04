package filaQueue;
import equals_hash_code.*;

import java.util.LinkedList;
import java.util.Queue;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Carro> filaCarros = new LinkedList<Carro>();
		
		filaCarros.add(new Carro("Ford"));
		filaCarros.add(new Carro("Fusca"));
		filaCarros.add(new Carro("Chevette"));
		filaCarros.add(new Carro("BMW"));
		
		System.out.println(filaCarros);
		
		System.out.println(filaCarros.peek());
		System.out.println(filaCarros.poll());
		
		System.out.println(filaCarros);
		
		
	}

}
