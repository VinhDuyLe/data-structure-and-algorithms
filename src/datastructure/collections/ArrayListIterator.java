package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        //Iterator display contents
        Iterator itr = a1.iterator();
        System.out.print("Origin element of list: ");
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //Modify Iterator
        ListIterator litr = a1.listIterator();
        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified contents of list: ");
        itr = a1.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        //Display backwards
        System.out.print("\nModified list backwords: ");
        while(litr.hasPrevious()){
            Object element = litr.previous();
            System.out.print(element + " ");
        }
    }
}
