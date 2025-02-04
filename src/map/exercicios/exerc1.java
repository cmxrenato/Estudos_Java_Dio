package map.exercicios;

import java.util.*;

public class exerc1 {
    public static void main(String[] args){
        Map<String,Integer> dicionarioEstados = new HashMap<>();
        dicionarioEstados.put("PE", 9616621);
        dicionarioEstados.put("AL", 3351543);
        dicionarioEstados.put("CE", 9187103);
        dicionarioEstados.put("RN", 3534265);
        System.out.println(dicionarioEstados);
        dicionarioEstados.replace("RN", 3534165);
        System.out.println(dicionarioEstados);
        System.out.println(dicionarioEstados.containsKey("PB"));
        dicionarioEstados.put("PB", 4039277);
        System.out.println(dicionarioEstados);
        System.out.println("A população de PE: "+dicionarioEstados.get("PE"));
        System.out.println("");
        System.out.println("Todos os Estados na ordem que foram informados: ");
        Map<String,Integer> dicionarioEstados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for(Map.Entry<String,Integer> estado:dicionarioEstados1.entrySet()){
            System.out.println(estado);
        }
        System.out.println("");
        System.out.println("Todos os Estados na ordem alfabética: ");
        Map<String,Integer> dicionarioEstados2 = new TreeMap<>();
        dicionarioEstados2.putAll(dicionarioEstados);
        for(Map.Entry<String,Integer> estado:dicionarioEstados2.entrySet()){
            System.out.println(estado);
        }
        System.out.println("");
        System.out.println("Estado com menor população: ");
        System.out.println(Collections.min(dicionarioEstados2.values()));
        System.out.println("");
        System.out.println("Estado com maior população: ");
        System.out.println(Collections.max(dicionarioEstados2.values()));
        System.out.println("");
        System.out.println("A soma de toda a população dos estados: ");
        Integer soma = 0;
        for(Map.Entry<String,Integer> estado:dicionarioEstados2.entrySet()){
          soma += estado.getValue();
        }
        System.out.println(soma);
        System.out.println("");
        System.out.println("A média da população dos Estados: ");
        System.out.println(soma/dicionarioEstados2.size());
        System.out.println("");
        System.out.println("Remover os Estados < 4000000: ");
        Iterator<Map.Entry<String,Integer>> iterator = dicionarioEstados2.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getValue() < 4000000){
                iterator.remove();
            }
        }
        for(Map.Entry<String,Integer> estado:dicionarioEstados2.entrySet()){
            System.out.println(estado);
        }
        dicionarioEstados2.clear();
        System.out.println(dicionarioEstados2.isEmpty());


    }
}
