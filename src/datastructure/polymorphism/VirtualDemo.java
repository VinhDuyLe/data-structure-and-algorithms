package datastructure.polymorphism;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();

        System.out.println("\n");
        Employee e2 = new Salary(" odaf", "djf", 1, 334.0);
    }
}
