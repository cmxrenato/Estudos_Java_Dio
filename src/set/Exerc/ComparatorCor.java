package set.Exerc;

import java.util.Comparator;

public class ComparatorCor implements Comparator<ArcoIris> {

    public ComparatorCor() {
    }

    @Override
    public int compare(ArcoIris o1, ArcoIris o2) {
        return o1.getCor().compareTo(o2.getCor());
    }
}
