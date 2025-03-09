package specialistern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor a ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Valor b ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Valor c ");
        double c = Double.parseDouble(scanner.nextLine());



        if((a < b+c) && (b<a+c)&& (c<a+b)){
            if((a==b)&&(b==c)){
                System.out.println("Triângulo Equilátero");
            }else{
                if((a==b)||(b==c)||(a==c)){
                    System.out.println("Triângulo Isósceles");
                }else{
                    System.out.println("Triângulo Escaleno");
                }
            }
        }else{
            System.out.println("Não é possível formar um triângulo");
        }
    }

}
