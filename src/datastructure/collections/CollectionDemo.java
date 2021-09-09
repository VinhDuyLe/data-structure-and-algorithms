package datastructure.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        Map m1 = new HashMap();

        m1.put("Zara", 8);
        m1.put("Mahnaz", 16);
        m1.put("Ayan", "12");

        System.out.println("Map elements");
        System.out.println("\t" + m1);
        System.out.println(m1.size());
        System.out.println(m1.get("Zara"));
        System.out.println(m1.get("Ayan"));
    }
}
