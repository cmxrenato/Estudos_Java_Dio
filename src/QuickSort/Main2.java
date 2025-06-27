package QuickSort;

public class Main2 {

    public static int pivot(int[] arr){
        int fim = arr.length;
        int pivot = arr[fim - 1];
        return pivot;
    }



    public static void main(String[] args){
        int[] numeros = {5, 9, 24, 1, 3, 38};
        System.out.println(pivot(numeros));

    }
}
