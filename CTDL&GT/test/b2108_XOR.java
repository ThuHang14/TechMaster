package test;

public class b2108_XOR {
    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        for (String s : words
        ) {
            if (convert(s)) {
                return s;
            }
        }
        return "";
    }

    public static boolean convert(String a) {
        int j = a.length() - 1;
        int i = 0;
        while ( j >i) {
                if (a.charAt(i++) != a.charAt(j--)) {
                    return false;
                }
            }

        return true;
    }
}
