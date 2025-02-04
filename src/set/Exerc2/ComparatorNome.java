package set.Exerc2;

import java.util.Comparator;

public class ComparatorNome implements Comparator< LinguagemFavorita> {


    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
