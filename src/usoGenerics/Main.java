package usoGenerics;

public class Main{

    public static void main(String[] args) {
        // Exemplo de uso de generics com uma lista de Strings
        ListaGenerica<String> lista = new ListaGenerica<>();
        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terceiro");

        System.out.println("Lista de Strings: " + lista);

        // Exemplo de uso de generics com uma lista de Inteiros
        ListaGenerica<Integer> listaInteiros = new ListaGenerica<>();
        listaInteiros.adicionar(1);
        listaInteiros.adicionar(2);
        listaInteiros.adicionar(3);

        System.out.println("Lista de Inteiros: " + listaInteiros);
    }



}
