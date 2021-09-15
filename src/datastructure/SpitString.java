package datastructure;

import java.util.Scanner;

public class SpitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        /*for(String ss: arr) {
            System.out.println(ss);
        }*/
        /*for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}
