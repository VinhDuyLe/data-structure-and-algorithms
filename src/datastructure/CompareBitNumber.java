package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareBitNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); // 01
        list.add(2); // 10
        list.add(11); // 1011
        list.add(3); // 11
        list.add(4); // 100
        list.add(5); // 101

        System.out.println(list);

        Collections.sort(list, (o1, o2) -> {
            int count1 = Integer.bitCount(o1);
            int count2 = Integer.bitCount(o2);
            return count2 - count1;
        });

        System.out.println(list);

    }
}
