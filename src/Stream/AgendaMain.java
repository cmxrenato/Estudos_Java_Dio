package Stream;

import java.util.*;
import java.util.function.Function;

public class AgendaMain {
    public static void main(String[] args){

        Map<Integer,Contato> agenda = new HashMap<>();
        agenda.put(1,new Contato("Simba",2222));
        agenda.put(4,new Contato("Cami",5555));
        agenda.put(3,new Contato("Jon",1111));



        System.out.println("Ordenação por número do contato:");
        //fazendo uma classe anônima:
        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(),cont2.getValue().getNumero());
            }
        });

        //Usando uma function:

        Set<Map.Entry<Integer,Contato>> set2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));

        //usando um Lambda:
        Set<Map.Entry<Integer,Contato>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));



        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa: set){
            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }
        System.out.println(" ");
        set2.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa: set2){

            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }
        System.out.println(" ");
        set3.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa: set3){

            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }

        System.out.println("--------------");
        System.out.println("Ordenação por nome do contato");
        // Função anônima:
        Set<Map.Entry<Integer,Contato>> nome = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> nome1, Map.Entry<Integer, Contato> nome2) {
                return CharSequence.compare(nome1.getValue().getNome(),nome2.getValue().getNome());
            }
        });
        //Usando o function:
        Set<Map.Entry<Integer,Contato>> nome2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato> ContatoEntry) {
                return ContatoEntry.getValue().getNome();
            }
        }));

        //Usando Lambda:
        Set<Map.Entry<Integer,Contato>> nome3 = new TreeSet<>(Comparator.comparing(name -> name.getValue().getNome()));




        nome.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa : nome){
            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }
        System.out.println(" ");
        nome2.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa : nome2){
            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }
        System.out.println(" ");
        nome3.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> pessoa : nome3){
            System.out.println("ID: "+pessoa.getKey()+" - "+pessoa.getValue());
        }

    }
}
