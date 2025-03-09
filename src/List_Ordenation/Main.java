package List_Ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Gato> listaGatos = new ArrayList<>();

    listaGatos.add(new Gato("Jon", 18, "preto"));
    listaGatos.add(new Gato("Simba", 6, "tigrado"));
    listaGatos.add(new Gato("Jon", 12, "amarelo"));
        //ordem de inserção
        System.out.println(listaGatos);

        //ordem aleatória
        Collections.shuffle(listaGatos);
        System.out.println(listaGatos);

        //Ordem natural: Ordem alfabética.
        Collections.sort(listaGatos);
        System.out.println(listaGatos);

        //Ordem por idade
        Collections.sort(listaGatos,new ComparatorIdade());
            //listaGatos.sort(new ComparatorIdade());
        System.out.println(listaGatos);

        //Ordem por cor
        Collections.sort(listaGatos,new ComparatorCor());
        System.out.println(listaGatos);

        //Ordem por nome, cor e idade

        Collections.sort(listaGatos,new ComparatorNomeCorIdade());
        System.out.println(listaGatos);



    }
}