package result;

public class b2185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String a : words
        ) {
            if (check(a, pref)) {
                count++;
            }
        }
        return count;
    }

    public static boolean check(String a, String pref) {
        if( a.length()<pref.length()) return false;
        for (int i = 0; i < pref.length(); i++) {
            if (a.charAt(i) != pref.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
