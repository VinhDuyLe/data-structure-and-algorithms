package datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        FileWriter write = new FileWriter("testout.txt",true);
        BufferedWriter buffer = new BufferedWriter(write);
        buffer.write("%\n");
        buffer.write("\n");
        buffer.write("Welcome to javaTpoint 2 \n");
        buffer.close();
        System.out.println("success");
    }
}
