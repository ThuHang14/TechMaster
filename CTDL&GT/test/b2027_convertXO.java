package test;

import java.util.ArrayList;
import java.util.List;

public class b2027_convertXO {
    public static void main(String[] args) {
        System.out.println(minimumMoves("XXOXOOOXOOOXX"));
    }

    public static int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}
