package datastructure.overriding;
class Animal{
    public void move() {
        System.out.println("Animal can move");
    }
}
class Dog extends Animal {
    public void move() {
        super.move();
        System.out.println("Dog can walk and run");
    }
    public void bark(){
        System.out.println("Dog can bark");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Dog c = new Dog();

        a.move();
        b.move();
       // b.bark(); could not bc Animal doesn't have bark method
        c.bark();
    }
}
