package set.Exerc2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args){
        Set<LinguagemFavorita> conjLing = new LinkedHashSet<>();
        conjLing.add(new LinguagemFavorita("Java", 1995, "Eclipse"));
        conjLing.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        conjLing.add(new LinguagemFavorita("C", 1972, "Vscode"));

        System.out.println("Ordem de inserção: ");
        for(LinguagemFavorita ling : conjLing){
            System.out.println(ling.getNome() + " - "+ling.getAnoDeCriacao()+ " - "+ ling.getIde());
        }

        Set<LinguagemFavorita> conjOrdNatural = new TreeSet<>(new ComparatorNome()){{
            addAll(conjLing);
        }};
        System.out.println("Ordem Natural: ");
        for(LinguagemFavorita ling : conjOrdNatural){
            System.out.println(ling.getNome() + " - "+ling.getAnoDeCriacao()+ " - "+ ling.getIde());
        }

        Set<LinguagemFavorita> conjOrdIde = new TreeSet<>(new ComparatorIde());
           conjOrdIde.addAll(conjLing);

        System.out.println("Ordem Ide: ");
        for(LinguagemFavorita ling : conjOrdIde){
            System.out.println(ling.getNome() + " - "+ling.getAnoDeCriacao()+ " - "+ ling.getIde());
        }

        Set<LinguagemFavorita> conjOrdAnoNome = new TreeSet<>(new ComparatorAnoNome());
        conjOrdAnoNome.addAll(conjLing);

        System.out.println("Ordem Ano/Nome: ");
        for(LinguagemFavorita ling : conjOrdAnoNome){
            System.out.println(ling.getNome() + " - "+ling.getAnoDeCriacao()+ " - "+ ling.getIde());
        }

        Set<LinguagemFavorita> conjOrdNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
        conjOrdNomeAnoIde.addAll(conjLing);
        System.out.println("Ordem Nome/Ano/IDE: ");
        for(LinguagemFavorita ling : conjOrdNomeAnoIde){
            System.out.println(ling.getNome() + " - "+ling.getAnoDeCriacao()+ " - "+ ling.getIde());
        }













    }



}
