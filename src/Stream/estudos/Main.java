package Stream.estudos;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = Arrays.asList("João", "Maria", "José", "Ana", "Júlia");

        nomes.stream()
             .filter(nome -> nome.startsWith("J"))
             .forEach(System.out::println);
	}

}
