package datastructure;

import org.junit.platform.commons.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckJunk {
    public static void main(String[] args) {
        /*//String str = "a b dn$19";
        //Pattern p = Pattern.compile("[^A-Za-z]");
        Pattern p = Pattern.compile("[^A-Za-z]");
        Matcher m = p.matcher("a b dn A");
        if (m.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        Pattern p = Pattern.compile("[^A-Za-z ]");
        Matcher m = p.matcher("a b dn A $#");
        boolean b = m.find();
        if (b)
            System.out.println("There is a special character in my string ");
        else
            System.out.println("There is no special char.");
    }
}
