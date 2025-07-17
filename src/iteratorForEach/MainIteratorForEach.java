package iteratorForEach;
import java.util.*;

public class MainIteratorForEach {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Jaca");

        // Mostrar a lista original
        System.out.println("Lista original:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Remover "Banana" com Iterator
        Iterator<String> iterador = frutas.iterator();
        while (iterador.hasNext()) {
            
            if (iterador.next().equals("Banana")) {
                iterador.remove(); // Remoção segura
            }
            
        }

        // Mostrar a lista final
        System.out.println("\nLista final (sem Banana):");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
