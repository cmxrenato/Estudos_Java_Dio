package Desafio_DIO_POO;

import Desafio_DIO_POO.dominio.Curso;
import Desafio_DIO_POO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Matematica");
        curso.setDescricao("Básico");
        curso.setCargaHoraria(60);
        System.out.println(curso);
        Curso curso2 = new Curso();
        curso2.setTitulo("Português");
        curso2.setDescricao("Básico");
        curso2.setCargaHoraria(90);
        System.out.println(curso2);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprender Java");
        mentoria.setDescricao("Avançado");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }
}
