package set.Exerc;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<ArcoIris> coresArcoIris = new LinkedHashSet<>();

        coresArcoIris.add(new ArcoIris("Vermelho"));
        coresArcoIris.add(new ArcoIris("Laranja"));
        coresArcoIris.add(new ArcoIris("Amarelo"));
        coresArcoIris.add(new ArcoIris("Verde"));
        coresArcoIris.add(new ArcoIris("Azul"));
        coresArcoIris.add(new ArcoIris("Anil"));
        coresArcoIris.add(new ArcoIris("Violeta"));

        Set<ArcoIris> coresArcoIris2 = new TreeSet<>();
        coresArcoIris2.addAll(coresArcoIris);
        int count = 0;
        for(ArcoIris cor : coresArcoIris){
            System.out.println(cor);
            count++;
        }
        List<ArcoIris> listaCores = new ArrayList<>(coresArcoIris);
        Collections.reverse(listaCores);




        System.out.println("O número de cores é: "+count);
        System.out.println("As cores em ordem alfabética: "+ coresArcoIris2);
        System.out.println("As cores na ordem inversa a que foi informada: "+ listaCores);
        System.out.println("Exibindo as cores que começam com a letra 'v': ");

        Iterator<ArcoIris> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            String cor = iterator.next().getCor();

            if(cor.startsWith("V")){
                System.out.println(cor);
            }else{
                iterator.remove();
            }
        }

        System.out.println("Removendo todas as cores que não começam pela letra v: "+ coresArcoIris);
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        System.out.println(coresArcoIris.isEmpty());








    }


}
