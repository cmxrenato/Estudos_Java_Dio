package usoGenerics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> elementos = new ArrayList<>();

    public void adicionar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
