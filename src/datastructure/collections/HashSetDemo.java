package datastructure.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        int[] count = {34, 22, 10, 60, 30, 22};
        Set<Integer> s1 = new HashSet<Integer>();
       try {
            for (int i = 0; i < count.length; i++) {
                s1.add(count[i]);
            }
            System.out.println("HashSet element \n" + s1);

            TreeSet sortedSet = new TreeSet<Integer>(s1);
            System.out.println("The sorted list is \n" + sortedSet);
            System.out.println("The first element of the set is " + (Integer) sortedSet.first());
            System.out.println("The last element of the test is " + (Integer) sortedSet.last());
       } catch (Exception e) { }
    }
}
