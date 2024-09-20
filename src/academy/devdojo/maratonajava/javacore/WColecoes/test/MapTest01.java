package academy.devdojo.maratonajava.javacore.WColecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Um");
        map.put(2,"Dois");
        map.put(3,"Tres");
        map.put(4,"Quatro");
        map.put(5,"Cinco");
        map.put(5,"Cinco5");//Sobrescreve o valor
        map.putIfAbsent(5, "CincoDenovo");//Só vai adicionar caso a chave n exista

        System.out.println(map.get(5));

        for(Integer key : map.keySet()){
            System.out.println("key " + key + " " + map.get(key));
        }

        for(String value : map.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
