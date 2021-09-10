package datastructure.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        System.out.println("Original size of array " + a1.size());

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("F");
        a1.add(1,"B");
        System.out.println("Size after additions " + a1.size());
        System.out.println("Contents of Array " + a1);

        a1.remove("F");
        a1.remove(3);
        System.out.println("Size after remove " + a1.size());
        System.out.println("Contents after remove " + a1);
    }
}
