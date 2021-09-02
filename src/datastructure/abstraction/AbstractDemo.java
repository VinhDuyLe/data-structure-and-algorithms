package datastructure.abstraction;

public class AbstractDemo {
    public static void main(String[] args) {

        //Employee is abstract so could not instantiated....
        //Employee e = new Employee("George W.", "Houston, TX", 43);
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference __");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference__");
        e.mailCheck();
    }
}
