package datastructure.Inheritance;

public class Sub_class extends Super_class {
    int num = 10;

    public void display() {
        System.out.println("This is the display method of subclass");
    }
    public void my_method() {
        Sub_class sub = new Sub_class();
        sub.display();
        super.display();
        System.out.println("value of the variable named num in the subclass " + sub.num);
        System.out.println("value of the variable named num in the super class " + super.num);
    }

    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
