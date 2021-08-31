package datastructure.Inheritance;

public class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);

        //inherit fields, methods, nested class
        // not inherit Constructors, demo2 could not use multiplication method

        Calculation demo2 = new Calculation();
        demo2.addition(a,b);
        demo2.subtraction(a,b);
    }
}
