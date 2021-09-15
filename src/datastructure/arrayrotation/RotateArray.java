package datastructure.arrayrotation;

public class RotateArray {
    void leftRotate(int[] arr, int d) {
        for (int i = 0; i < d; i++ ) {
            leftRotateByOne(arr);
        }
    }

    void leftRotateByOne(int[] arr) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
    void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 10);
        rotate.printArray(arr);
    }
}
