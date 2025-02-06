package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class MainStreamApi {
    public static void main(String[] args){
        List<String> numerosAleatorios = Arrays.asList("1","2","5","7","0","3","9","6","1","5","8","10");
        System.out.println(numerosAleatorios);
        System.out.println("Imprimir todos os elementos da lista(Consumer): ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("Imprimir todos os elementos da lista(lambda): ");
        numerosAleatorios.stream().forEach( s->System.out.println(s));

        System.out.println("Imprimir todos os elementos da lista(Reference Method): ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> collectLista = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        collectLista.forEach(System.out::println);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> lista2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        /*List<Integer> lista2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if(integer > 2 && integer % 2 == 0){
                            return true;
                        }
                        return false;
                    }
                }).collect(Collectors.toList());*/

        System.out.println(lista2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
                .ifPresent(System.out::println);

        System.out.println("Remova os números ímpares: ");

        //O stream não altera a lista.
        List<Integer> list3 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list3);
        list3.removeIf(integer ->integer % 2 != 0 );

        System.out.println(list3);
    }
}
