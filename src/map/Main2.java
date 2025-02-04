package map;

import java.util.*;

public class Main2 {
    public static void main(String[] args){

        Map<String, Double> carros = new HashMap<>();
        carros.put("gol",14.4);
        carros.put("uno",15.6);
        carros.put("mobi",16.1);
        carros.put("hb20",14.5);
        carros.put("kwid",15.6);

        Map<String, Double> carros1 = new LinkedHashMap<>();
        carros1.put("gol",14.4);
        carros1.put("uno",15.6);
        carros1.put("mobi",16.1);
        carros1.put("hb20",14.5);
        carros1.put("kwid",15.6);

        System.out.println(carros1);

        carros.put("gol",15.2);
        System.out.println(carros.containsKey("uno"));


        System.out.println(carros);
        System.out.println(carros.get("uno"));
        System.out.println(carros.keySet());
        System.out.println(carros.values());
        Double consumoMaisEficiente = Collections.max(carros.values());
        System.out.println(Collections.max(carros.values()));
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> carro : carros.entrySet()) {

            if(carro.getValue().equals(consumoMaisEficiente)){
               modeloMaisEficiente = carro.getKey();
                System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente + "-"+ consumoMaisEficiente);            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Remova os modelos com o consumo igual a 15,6: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carros);

        System.out.println("Exiba ordenado pelo modelo: ");

        System.out.println("Original: " + carros1);
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println("Ordenado por ordem natural: " + carros2);

        carros.clear();
        System.out.println(carros);
        System.out.println(carros.isEmpty());



    }
}
