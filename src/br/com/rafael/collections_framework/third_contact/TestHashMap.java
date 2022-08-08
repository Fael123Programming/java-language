package br.com.rafael.collections_framework.third_contact;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //HashMap não mantém ordem de inserção.
        //LinkedHashMap mantém.
        //Maps não aceitam chaves duplicadas. Ele substitue o valor mapeado ao invés de criar um novo.
        map.put(1, "one");
        map.put(189, "one hundred eighty nine");
        map.put(3, "tree");
        map.put(3, "three"); // Apenas substitue o valor da chave já existente.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " maps to " + entry.getValue());
        }
    }
}
