package set;

import java.util.*;

import equals_hash_code.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Toyota"));
		hashSetCarros.add(new Carro("Rural"));
		
		
		
		System.out.println(hashSetCarros);
		
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Toyota"));
		treeSetCarros.add(new Carro("Rural"));
		
		System.out.println(treeSetCarros);
		
	}

}
