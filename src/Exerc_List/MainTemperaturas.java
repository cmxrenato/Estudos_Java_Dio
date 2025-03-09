package Exerc_List;

import java.util.ArrayList;
import java.util.List;

public class MainTemperaturas {
    public static void main(String[] args){

        List<Temperaturas> listaTemp = new ArrayList<>();

        listaTemp.add(new Temperaturas(1,"Janeiro",23.5));
        listaTemp.add(new Temperaturas(2,"Fevereiro", 19.5));
        listaTemp.add(new Temperaturas( 3,"Março",19d));
        listaTemp.add(new Temperaturas( 4,"Abril", 1d));
        listaTemp.add(new Temperaturas(5,"Maio", 31.9));
        listaTemp.add(new Temperaturas(6,"Junho", 41d));



        Double soma = 0d;
             for (Temperaturas temperaturas : listaTemp) {

                 System.out.println(temperaturas.getNumMes() + "-"+ temperaturas.getMes()+ "="+ temperaturas.getTemp());

                 soma += temperaturas.getTemp();


             }
        Double media = soma/listaTemp.size();
        System.out.println("Média: "+ media);
        System.out.println("As temperaturas acima da média são: ");
            for(Temperaturas temperaturas : listaTemp){
                if(temperaturas.getTemp() > media){
                    System.out.println(temperaturas.getNumMes()+"-" + temperaturas.getMes()+ "="+ temperaturas.getTemp());
                }
            }

        }

    }



