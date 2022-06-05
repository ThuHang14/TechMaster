package ktra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ktra_500 {
    public static void main(String[] args) {
        String[] b = {"asdsdf", "sfd","omk","Hello", "Alaska", "Dad", "Peace"}; // 0 1 4 5
       System.out.println(Arrays.toString(findWords(b)));
    }

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String[] arr = {};

        String w1 = "bcmnvxz";
        String w2 = "adfghjkls";
        String w3 = "qwertyuiop";

        for (String s : words
        ) {
            if (findWord(s,w1)||findWord(s,w2)||findWord(s,w3)) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);

    }

    public static boolean findWord(String word ,String w) {
        word = word.toLowerCase();
        for (int i = 0; i <word.length() ; i++) {
            if(!w.contains(Character.toString(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}