package set.Exerc2;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int i = l1.getIde().compareTo(l2.getIde());

        return i;

    }
}

