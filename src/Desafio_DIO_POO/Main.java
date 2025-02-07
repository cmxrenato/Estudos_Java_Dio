package Desafio_DIO_POO;

import Desafio_DIO_POO.dominio.Curso;
import Desafio_DIO_POO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso("Matematica", "Basico", 20);
        System.out.println(curso);
        Curso curso2 = new Curso("Português", "Basico", 50);
        System.out.println(curso2);
        Mentoria mentoria = new Mentoria("Java", "Avançado", LocalDate.now() );
        System.out.println(mentoria);

    }
}
