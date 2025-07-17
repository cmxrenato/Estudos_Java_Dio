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
			    new Pessoa("Bruna", 54)
			);
		//imprime tudo
		//pessoas.forEach(System.out::println);
		
		System.out.println("Pessoas com mais 30 anos: ");
		pessoas
		.stream()
		.filter(p -> p.getIdade() > 30)
		.forEach(System.out::println);
		
		System.out.println("Média das idades:");
		double media = pessoas
				.stream()
				.mapToInt(Pessoa::getIdade)
				.average()
				.orElse(0);
		System.out.println(media);
		
		System.out.println("Nomes ordenados:");
		List<String> nomes = pessoas.stream()
		.map(Pessoa::getNome)
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(nomes);
		
		System.out.println("Agrupamento por idade:");
		Map<Integer,List<Pessoa>> agrupadoPorIdade = pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getIdade));
		
		agrupadoPorIdade.forEach((idade,grupo) -> {
			System.err.println("Idade: "+idade+" : "+grupo);
			
		});
		
		
		
		
		
		
		
		
	}
	
}