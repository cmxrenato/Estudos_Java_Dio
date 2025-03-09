package specialistern;

import java.util.Scanner;

public class DistanciaPassageiro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double preco;


        System.out.println("Quantos km será a viagem: ");
        double km = Double.parseDouble(scanner.nextLine());

        if(km <= 200.0){
            preco = 0.5*km;
        }else {
            preco = 0.45*km;
        }

        System.out.println("O valor da passagem: "+preco);


    }






}
