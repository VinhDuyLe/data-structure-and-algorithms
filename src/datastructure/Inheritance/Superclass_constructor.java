package datastructure.Inheritance;

class Superclass_constructor {
    int age;
    Superclass_constructor(int age) {
        this.age = age;
    }
    public void getAge() {
        System.out.println("The value of variable age in superclass " + age);
    }
}
