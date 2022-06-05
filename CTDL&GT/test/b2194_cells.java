package test;

import java.util.ArrayList;
import java.util.List;

public class b2194_cells {
    public static void main(String[] args) {
        System.out.println(cellsInRange("A1:D9"));
    }


    public static List<String> cellsInRange(String s) {
        char[] arrChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        List<Character> listChar = new ArrayList<>();
        List<Character> listInt = new ArrayList<>();
        for (int i = s.charAt(0) - 'A'; i <= s.charAt(3) - 'A'; i++) {
            listChar.add(arrChar[i]); // [A, B, C, D]
        }
        for (int i = s.charAt(1); i <= s.charAt(4); i++) {
            listInt.add((char) i); // 1 2 3 4 5 6 7 8 9
        }
        List<String> cells = new ArrayList<>();

        for (int i = 0; i < listChar.size(); i++) {
            for (int j = 0; j < listInt.size(); j++) {
                cells.add("" + listChar.get(i) + "" + listInt.get(j));
            }
        }
        return cells;

    }


    public List<String> cellsInRange2(String s) {
        List<String> cells = new ArrayList<>();

        for (int i = s.charAt(0); i <= s.charAt(3); i++) {
            for (int j = s.charAt(1); j <= s.charAt(4); j++) {
                cells.add("" + (char) i + "" + (char) j);
            }
        }
        return cells;
    }
}
