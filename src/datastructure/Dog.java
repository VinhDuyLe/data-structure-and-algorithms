package datastructure;

public class Dog {
    int height, weight;
    String name;
    String breed;
    static int numberOfDogs; //static so share variable value to all of Dog

    public void speak() {
        System.out.println("afw!");
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int w) {
        this.weight = w;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public boolean isBigDog(int height, int weight) {
        // add: static : error, cannot test individual
        if(height > 40 || weight > 75) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isSmallDog() {
        if(height < 35 || weight < 40) {
            return true;
        } else {
            return false;
        }
    }

    public Dog() {
        this.weight =0;
        this.height = 0;
        name = "spot";
        breed = "poodle";
    }

    public Dog(String name, String bread, int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.breed = bread;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("fluffy", "poodle",100, 100);
        //d1.name = "fluffy";
        //d1.setHeight(1000);
        //d1.setWeight(1000);
        d1.numberOfDogs = 1;
        Dog d2 = new Dog();
        //d2.name = "spot";
        d2.numberOfDogs = 2;
        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d1.numberOfDogs);
        System.out.println(d1.isBigDog(1000,1000));
    }
}
