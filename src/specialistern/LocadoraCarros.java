package specialistern;

import java.util.Scanner;

public class LocadoraCarros {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de Km pecorridos: ");
        double km = Double.parseDouble(scanner.nextLine());

        System.out.println("Quantidade de dias que o carro passou alugado: ");
        int dias = Integer.parseInt(scanner.nextLine());

        double total = dias*90 + 0.2*km;

        System.out.println("Total a pagar é de: "+total);


    }

}
