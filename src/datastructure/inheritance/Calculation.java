package datastructure.inheritance;

class Calculation {
    int z;
    public void addition (int x, int y) {
        z = x + y;
        System.out.println("The sum of given number " + z);
    }
    public void subtraction(int x, int y) {
        z = x -y;
        System.out.println("The difference between the given numbers " + z);
    }
}
