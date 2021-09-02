package datastructure.encapsulation;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest en = new EncapTest();
        en.setName("James");
        en.setIdNum("123abc");
        en.setAge(20);
        System.out.println("Name " + en.getName() + " Idnum " + en.getIdNum() + " Age" + en.getAge());
    }
}
