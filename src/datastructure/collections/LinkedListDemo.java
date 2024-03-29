package datastructure.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");
        System.out.println("Original contents of 11 " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents after deletions " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after remove first and last " + ll);

        Object val = ll.get(2);
        ll.set(2, (String)val + " Changed");
        System.out.println("ll afer change " + ll);
    }
}
