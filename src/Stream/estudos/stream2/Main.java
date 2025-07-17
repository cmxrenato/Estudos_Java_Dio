package Stream.estudos.stream2;
import java.util.*;
import java.util.stream.*;

public class Main{
	public static void main(String args[]) {
		List<Pessoa> pessoas = Arrays.asList(
			    new Pessoa("João", 25),
			    new Pessoa("Maria", 30),
			    new Pessoa("Pedro", 18),
			    new Pessoa("Ana", 22),
			    new Pessoa("Joana", 30)
			);
		System.out.println("Pessoas com mais de 20 anos:");
		pessoas.stream()
	    .filter(p -> p.getIdade() > 20)
	    .forEach(System.out::println);
		
		System.out.println("Obter nomes de quem tem 30 anos:");
		
		List<String> nomes30 = pessoas.stream()
			    .filter(p -> p.getIdade() == 30)
			    .map(Pessoa::getNome)
			    .collect(Collectors.toList());

			System.out.println(nomes30);

		System.out.println("Média de idades:");
		double media = pessoas.stream()
			    .mapToInt(Pessoa::getIdade)
			    .average()
			    .orElse(0);

			System.out.println("Média de idade: " + media);
			
			
			
		System.out.println("Agrupar pessoas por idade:");
		Map<Integer, List<Pessoa>> agrupadoPorIdade = pessoas.stream()
			    .collect(Collectors.groupingBy(Pessoa::getIdade));

			agrupadoPorIdade.forEach((idade, grupo) -> {
			    System.out.println("Idade " + idade + ": " + grupo);
			});
			
			
		System.out.println("Contar quantas pessoas tem dos grupos:");
		Map<Integer, Long> contagem = pessoas.stream()
			    .collect(Collectors.groupingBy(Pessoa::getIdade, Collectors.counting()));

			System.out.println(contagem);


	}
}