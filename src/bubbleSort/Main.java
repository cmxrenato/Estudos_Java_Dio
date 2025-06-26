package bubbleSort;

import java.util.Arrays;

public class Main {

    public  static void bubbleSort(int[] arr) {
        int trocou = 1;
        int auxiliar;
        int iteracoes = 0;

        while (trocou == 1) {
            trocou = 0;
            for (int i = 0; i < arr.length - 1; i++) { // -1 para evitar acesso fora do array
                if (arr[i] > arr[i + 1]) {
                    auxiliar = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = auxiliar;
                    trocou = 1;
                }
                iteracoes++;
            }

        }
        System.out.println(Arrays.toString(arr)); // imprime o conteúdo do array

        System.out.println("Organização terminada com sucesso");
        System.out.println("Iterações realizadas: " + iteracoes);
    }

    public static void main(String[] args) {
        int[] numeros = {934, 755, 672, 585, 466, 375, 245, 133, 88, 9};
        System.out.println("Olá mundo!");
        bubbleSort(numeros);
    }
}
