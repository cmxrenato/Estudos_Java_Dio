package set;

import java.util.*;

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {

        int tempEp = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempEp != 0) return tempEp;
        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero;
    }
}
class ComparatorNomeGeneroTempo implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if(nome != 0) return nome;
        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if(genero != 0) return genero;
        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());




    }
}



public class OrdenationSetMain {
    public static void main(String[] args) {
        Set<Serie> setSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia",60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("that 70's show", "Comedia", 60));

        }};
        System.out.println("Ordem aleatoria");
        for(Serie serie : setSeries){
            System.out.println("----------------------------------");
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+serie.getGenero());
            System.out.println("TempEp: "+serie.getTempoEpisodio());
            System.out.println("----------------------------------");
        }
        System.out.println("Ordem de Inserção");
        Set<Serie> setSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia",60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("that 70's show", "Comedia", 25));
        }};
        for(Serie serie : setSeries2){
            System.out.println("----------------------------------");
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+serie.getGenero());
            System.out.println("TempEp: "+serie.getTempoEpisodio());
            System.out.println("----------------------------------");
        }

        System.out.println("Ordem natural - TempEp");
        Set<Serie> setSeries3 = new TreeSet<>(setSeries2);
        System.out.println(setSeries3);
        for(Serie serie : setSeries3){
            System.out.println("----------------------------------");
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+serie.getGenero());
            System.out.println("TempEp: "+serie.getTempoEpisodio());
            System.out.println("----------------------------------");
        }

        System.out.println("Ordem/Gênero/TempoEpisodio");
        Set<Serie> setSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        setSeries4.addAll(setSeries3);
        for(Serie serie : setSeries4){
            System.out.println("----------------------------------");
            System.out.println("Nome: "+serie.getNome());
            System.out.println("Gênero: "+serie.getGenero());
            System.out.println("TempEp: "+serie.getTempoEpisodio());
            System.out.println("----------------------------------");
        }


    }
}

