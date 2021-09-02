package datastructure.interfaces;

public class MammalInt implements Animal {
    public void eat() {
        System.out.println(" Mammal eats");
    }
    public void travel() {
        System.out.println(" Mammal travels");
    }
    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt ma = new MammalInt();
        ma.eat();
        ma.travel();
    }
}
