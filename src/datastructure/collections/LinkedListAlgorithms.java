package datastructure.collections;

import java.util.*;

public class LinkedListAlgorithms {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));
        ll.add(new Integer(-20));
        ll.add(new Integer(8));

        System.out.println("Before reverse " + ll);
        Comparator r = Collections.reverseOrder();

        Collections.sort(ll,r);
        System.out.println("After reverse " + ll);

        Iterator li = ll.iterator();
        System.out.print("List sorted in reverse ");
        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        Collections.shuffle(ll); //random
        System.out.println("\n\nshuffle" + ll);

        //display randomized list
        li = ll.iterator();
        System.out.print("List shuffle: ");
        while(li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println("\nMinimum " + Collections.min(ll));
        System.out.println("Maximum " + Collections.max(ll));
    }
}
