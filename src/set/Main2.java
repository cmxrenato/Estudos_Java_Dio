package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
    public static void main(String[] args){
        Set<Double> notas = new HashSet<>();
        notas.add(8.5);
        notas.add(8.0);
        notas.add(7.0);
        notas.add(9.5);
        notas.add(5.5);
        notas.add(5.5);

        System.out.println(notas);
        System.out.println(notas.contains(7d));
        System.out.println(notas.contains(7.5));
        System.out.println(Collections.min(notas));
        //Exibir a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
            while(iterator.hasNext()){
                soma += iterator.next();
            }
        System.out.println(soma);
        notas.remove(9.5);
        System.out.println(notas);
        //Remover as notas menores que 7 e exibir a lista
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);


        
    }

}
