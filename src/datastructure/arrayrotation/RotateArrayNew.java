package datastructure.arrayrotation;

//        1 2 3 4 5 6 7  8  9 10 11 12
//        4 2 3 7 5 6 10 8  9 1  11 12
//        4 5 3 7 8 6 10 11 9 1  2  12
//        4 5 6 7 8 9 10 11 12 1  2  3

public class RotateArrayNew {
    void leftRotate(int[] arr, int d, int n) {
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);

        for (i = 0; i < g_c_d; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if ( k >= n) {
                    k= k - n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        RotateArrayNew rotate = new RotateArrayNew();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        rotate.leftRotate(arr, 3, arr.length);
        rotate.printArray(arr, arr.length);
    }
}
