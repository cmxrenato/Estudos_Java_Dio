package map;

import java.util.*;

public class OrdenationMap {

    public static void main(String[] args){
        Map<String,Livro> favoritos = new HashMap<>();
        favoritos.put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
        favoritos.put("Duhig, Charles", new Livro("O poder do hábito ", 408));
        favoritos.put("Harari, Yuval Noah", new Livro("21 lições para o século 21 ", 432));


        for(Map.Entry<String,Livro> livro:favoritos.entrySet()){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome());
        }
        System.out.println(" ");
        System.out.println("Ordem de inserção: ");
        Map<String,Livro> favoritos1 = new LinkedHashMap<>();
        favoritos1.put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
        favoritos1.put("Duhig, Charles", new Livro("O poder do hábito ", 408));
        favoritos1.put("Harari, Yuval Noah", new Livro("21 lições para o século 21 ", 432));
        for(Map.Entry<String,Livro> livro:favoritos1.entrySet()){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome());
        }

        System.out.println(" ");
        System.out.println("Ordem alfabética dos autores: ");

        Map<String,Livro> favoritos2 = new TreeMap<>();
        favoritos2.putAll(favoritos1);
        for(Map.Entry<String,Livro> livro:favoritos2.entrySet()){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome());
        }
        System.out.println(" ");
        System.out.println("Ordem alfabética dos livros ");
        Set<Map.Entry<String,Livro>> favoritos3 = new TreeSet<>(new CompararLivro());
        favoritos3.addAll(favoritos1.entrySet());
        for(Map.Entry<String,Livro> livro:favoritos3){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome());
        }

        System.out.println(" ");
        System.out.println("Ordem por número de páginas:  ");
        Set<Map.Entry<String,Livro>> favoritos4 = new TreeSet<>(new CompararLivroPaginas());
        favoritos4.addAll(favoritos1.entrySet());
        for(Map.Entry<String,Livro> livro:favoritos4){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome() + " - "+livro.getValue().getPaginas());
        }



    }

}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }


}

class CompararLivro implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
    }
}

class CompararLivroPaginas implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}