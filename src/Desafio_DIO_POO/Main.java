package Desafio_DIO_POO;

import Desafio_DIO_POO.dominio.Bootcamp;
import Desafio_DIO_POO.dominio.Curso;
import Desafio_DIO_POO.dominio.Dev;
import Desafio_DIO_POO.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Matematica");
        curso.setDescricao("Básico");
        curso.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Português");
        curso2.setDescricao("Básico");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprender Java");
        mentoria.setDescricao("Avançado");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        devRenato.progredir();
        devRenato.progredir();

        System.out.println(devRenato.getConteudosInscritos());
        System.out.println(devRenato.getConteudosConcluidos());
        System.out.println("XP : "+devRenato.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();

        System.out.println(" ");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("XP : "+devJoao.calcularTotalXp());

    }
}
