package datastructure;

public class Punctuations {
    public static void main(String[] args) {
        String str = "Welcome #$*)@&$?you(@&@($ to #(@&$*#(?? Java ?!( thanks";
        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str);
    }
}
