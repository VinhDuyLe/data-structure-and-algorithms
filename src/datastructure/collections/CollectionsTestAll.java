package datastructure.collections;

import java.util.*;

public class CollectionsTestAll {
    public static void main(String[] args) {
        //Arraylist
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println("ArrayList elements");
        System.out.print("\t" + a1);

        //Linkedlist
        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println("LinkedList elements");
        System.out.println("\t" + l1);

        //HashTest
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println("HashTest elements");
        System.out.print("\t" + s1);

        //HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println("HashMap elements");
        System.out.println("\t" + m1);
    }
}
