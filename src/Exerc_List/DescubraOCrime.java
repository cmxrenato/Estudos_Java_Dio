package Exerc_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescubraOCrime {
    public static void main(String[] args){
        List<Respostas> questionario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int contador1 = 0;
        

        System.out.println("Interrogatório.Responda Sim com (s) ou Não com (n)");
        System.out.println("1. Telefonou para a vítima?");
        questionario.add(new Respostas(scanner.next()));
        System.out.println("2- Esteve no local do crime?");
        questionario.add(new Respostas(scanner.next()));
        System.out.println("3-Mora perto da vítima?");
        questionario.add(new Respostas(scanner.next()));
        System.out.println("4-Devia para a vítima?");
        questionario.add(new Respostas(scanner.next()));
        System.out.println("5- Já trabalhou com a vítima?");
        questionario.add(new Respostas(scanner.next()));

        for(Respostas resposta : questionario){

            if(resposta.getResposta().equals("s") || resposta.getResposta().equals("S")){

                contador1++;
            }
            

            }

        if(contador1 == 2){
            System.out.println("Suspeita!");
        } else if (contador1 >2 && contador1 < 5 ) {
            System.out.println("Cúmplice!");
        } else if (contador1 == 5) {
            System.out.println("Assassina!");
        }else{
            System.out.println("Inocente!");
        }


        System.out.println(questionario);
    }
}

class Respostas{
    private String resposta;

    public Respostas(String resposta) {
        this.resposta = resposta;
    }

    public String getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return "Respostas{" +
                "resposta='" + resposta + '\'' +
                '}';
    }
}