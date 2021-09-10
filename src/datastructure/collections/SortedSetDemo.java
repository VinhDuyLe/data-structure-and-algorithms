package datastructure.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println("TreeSet elements " + set);

        Iterator i = set.iterator(); //same Enumerations in Java Collection Framework
        while(i.hasNext()) {   //true if has next value
            //System.out.println(i.next());
            Object element = i.next();
            System.out.println(element.toString());
        }
    }
}
