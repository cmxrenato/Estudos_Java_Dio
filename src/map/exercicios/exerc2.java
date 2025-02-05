package map.exercicios;

import java.util.*;

public class exerc2 {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> listaNum = new ArrayList<>();
        Set<Integer> unicos = new HashSet<>();
        List<Integer> repetidos = new ArrayList<>();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        int numLancamentos= 6;

        for(int i = 0; i < 100; i++){

            Integer dado = random.nextInt(numLancamentos)+1;
            if(!unicos.add(dado)){
                repetidos.add(dado);
                switch (dado){
                    case 1:
                        a++;
                        break;
                    case 2:
                        b++;
                        break;
                    case 3:
                        c++;
                        break;
                    case 4:
                        d++;
                        break;
                    case 5:
                        e++;
                        break;
                    case 6:
                        f++;
                        break;
                }
            }
            listaNum.add(dado);
            System.out.println((i+1)+"º lançamento: "+dado);

        }
        System.out.println("Os números repetidos: "+repetidos);
        System.out.println("Números não repetidos: "+ unicos);
        System.out.println("O número 1 foi repetido: "+a);
        System.out.println("O número 2 foi repetido: "+b);
        System.out.println("O número 3 foi repetido: "+c);
        System.out.println("O número 4 foi repetido: "+d);
        System.out.println("O número 5 foi repetido: "+e);
        System.out.println("O número 6 foi repetido: "+f);
        //System.out.println("A soma de todos os repetidos: "+(a+b+c+d+e+f));
    }
}
