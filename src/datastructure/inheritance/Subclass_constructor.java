package datastructure.inheritance;

public class Subclass_constructor extends Superclass_constructor {

    Subclass_constructor(int age){
        super(age);
    }
    public static void main(String[] args) {
        Subclass_constructor s = new Subclass_constructor(24);
        s.getAge();
    }
}
