package Stream.estudos;
import java.util.*;
import java.util.stream.*;
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("Ana", "Carlos", "Ana", "Joana", "André");

        List<String> resultado = nomes.stream()
            .filter(nome -> nome.startsWith("A"))   // começa com A
            .distinct()                             // remove duplicados
            .sorted()                               // ordena alfabeticamente
            .map(String::toUpperCase)               // transforma em maiúsculas
            .collect(Collectors.toList());          // coleta em uma nova lista

        System.out.println(resultado);

	}

}
