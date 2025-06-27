package QuickSort;

import java.util.Arrays;

public class Main {
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(array, inicio, fim);
            quickSort(array, inicio, indicePivo - 1);  // antes do pivô
            quickSort(array, indicePivo + 1, fim);     // depois do pivô
        }
    }

    public static int particionar(int[] array, int inicio, int fim) {
        int pivot = array[fim]; // pivô é o último
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;
                // troca array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // coloca o pivô na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};
        quickSort(numeros, 0, numeros.length - 1);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
