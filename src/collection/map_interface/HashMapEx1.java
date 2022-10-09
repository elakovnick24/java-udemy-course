package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Nick Elakov");
        map1.put(3568, "Ivan Sidorov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        map1.put(null, "Sergey Petrov");
        map1.put(12345, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(15879);
        System.out.println(map1);
        System.out.println(map1.containsValue("Oleg Ivanov"));
        System.out.println(map1.containsKey(6578));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Smart");
    }
}
