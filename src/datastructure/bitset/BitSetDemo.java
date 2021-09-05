package datastructure.bitset;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for(int i = 0; i < 16; i++) {
            if((i % 2) == 0) {
                bits1.set(i);
            } if((i % 5) != 0) {
                bits2.set(i);
            }
        }
        System.out.println("Initial pattern of Bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern of Bits2: ");
        System.out.println(bits2);

        bits2.and(bits1);
        System.out.println("\nBits2 and Bits1: ");
        System.out.println(bits2);

        bits2.or(bits1);
        System.out.println("\nBits2 or Bits1: ");
        System.out.println(bits2);

        bits2.xor(bits1);
        System.out.println("\nBits2 xor Bits1: ");
        System.out.println(bits2);
    }
}
