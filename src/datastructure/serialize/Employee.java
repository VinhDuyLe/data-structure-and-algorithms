package datastructure.serialize;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN; //this field not serialize
    public int number;

    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
