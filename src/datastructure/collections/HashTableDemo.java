package datastructure.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));

        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + " : " + balance.get(str));
        }
        bal = (double) balance.get("Zara");  //.doubleValue()??
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }
}
