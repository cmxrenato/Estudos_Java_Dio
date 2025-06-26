package QuickSort;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void quickSort(int arr[]){
        Random random = new Random();

        int indiceAleatorio;
        int escolhido;
        int trocou = 1;
        int auxiliar;
        int iteracoes = 0;

        while(trocou == 1){
            trocou = 0;

            for(int i = 0; i < arr.length - 1;i++){
                indiceAleatorio = random.nextInt(arr.length);
                escolhido = arr[indiceAleatorio];
                if (arr[i] > escolhido) {

                    trocou = 1;
                }
                iteracoes++;
            }
        }
        System.out.println(Arrays.toString(arr)); // imprime o conteúdo do array

        System.out.println("Organização terminada com sucesso");
        System.out.println("Iterações realizadas: " + iteracoes);

    }



    public static void main(String[] args){
        Random random = new Random();
        int[] numeros = {5,78,6,23,89,99,76,54,34,76,23,12,56,-52,-44,-52,-89};
       /* int indiceAleatorio = random.nextInt(numeros.length);
        int escolhido = numeros[indiceAleatorio];
        System.out.println("O numero escolhido foi: "+escolhido);*/
        quickSort(numeros);
    }
}
