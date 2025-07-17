package Stream.estudos.projetinho1;
import java.util.*;
import java.util.stream.*;



public class Main{
	
	public static void main(String args[]) {
		
		List<Pessoa> pessoas = Arrays.asList(
			    new Pessoa("João", 25),
			    new Pessoa("Maria", 30),
			    new Pessoa("Pedro", 18),
			    new Pessoa("Ana", 22),
			    new Pessoa("Marcos", 52),
			    new Pessoa("Sandra", 55),
			    new Pessoa("Mateus", 18),
			    new Pessoa("Sandra", 54)
			);
		
		System.out.println("Pessoas com mais 30 anos: ");
		pessoas
		.stream()
		.filter(p -> p.getIdade() > 30)
		.forEach(System.out::println);
	}
	
}