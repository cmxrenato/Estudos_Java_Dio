package specialistern;


import java.util.Scanner;


public class Palindromo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        String minuscula = palavra.toLowerCase();
        char[] arrayPalavra = minuscula.toCharArray();
        char[] arrayInvertido = new char[arrayPalavra.length];




        for (int i = 0, j = arrayPalavra.length - 1; i < arrayPalavra.length; i++, j--) {
            arrayInvertido[i] = arrayPalavra[j];
        }






        System.out.println();




        boolean palindromo = true;
        for (int i = 0; i < arrayPalavra.length; i++) {
            if (arrayPalavra[i] != arrayInvertido[i]) {
                palindromo = false;
                break;
            }
        }


        if (palindromo) {
            System.out.println("A palavra " + palavra + " é um palíndromo!");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }


        scanner.close();
    }
}

