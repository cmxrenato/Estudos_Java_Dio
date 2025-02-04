package set.Exerc2;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        int ide = o1.getIde().compareTo(o2.getIde());
        if(nome != 0) {
            return nome;
        }
        if(ano != 0) {
            return ano;
        }

        return ide;

    }
}
