package List;

import equals_hash_code.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Carro> listaCarro = new ArrayList<Carro>();
		
		listaCarro.add(new Carro("Ford"));
		listaCarro.add(new Carro("Chevette"));
		listaCarro.add(new Carro("Brasília"));
		listaCarro.add(new Carro("Gol"));
		
		System.out.println(listaCarro);
		System.out.println(listaCarro.contains(new Carro("Ford")));
		System.out.println(listaCarro.get(2));
		System.out.println(listaCarro.indexOf(new Carro("Chevette")));
		System.out.println(listaCarro.remove(1));
		System.out.println(listaCarro);
	}

}
