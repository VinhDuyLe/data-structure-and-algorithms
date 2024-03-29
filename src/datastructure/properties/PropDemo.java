package datastructure.properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");

        states = capitals.keySet();
        Iterator itr = states.iterator();

        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str));
        }

        str = capitals.getProperty("Florida", "Not found");
        System.out.println("The capital of Florida is " + str +".");
    }
}
