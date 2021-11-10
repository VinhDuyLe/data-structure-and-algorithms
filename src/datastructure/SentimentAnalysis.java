package datastructure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentimentAnalysis {
    public static void main(String[] args) {
        String str = "4 a This-quiet , introspective and entertaining independent is worth seeking .";
        String[] part = str.split("\\s+", 2);
        int in = Integer.parseInt(part[0]);
        String allText = part[1].replaceAll("\\p{Punct}", " ");
        System.out.println(allText);

        String[] text = allText.trim().split("\\s+");
        for (String st : text) {
            System.out.println(st);
            if (st.equals("")) {
                System.out.println("empty");
            }
        }
        System.out.println(text.length);
    }
}
