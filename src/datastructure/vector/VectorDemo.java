package datastructure.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after 4 additions: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());


        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());


        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First Element " + (Integer)v.firstElement());
        System.out.println("Last Element " + (Integer)v.lastElement());

        if(v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }

        Enumeration eNum = v.elements();
        System.out.println("\nElements in Vector ");

        while(eNum.hasMoreElements()) {
            System.out.println(eNum.nextElement() + " ");
        }
    }
}
