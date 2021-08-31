package datastructure.inheritance;
interface Animal{}
class Mamal implements Animal{}

// a class only inherit 1 class (extends 1 class), 1super has many sub is ok
// a class can implement 1 or more interfaces

public class Dog extends Mamal{
    public static void main(String[] args) {
        Mamal m = new Mamal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Mamal);
    }
}
