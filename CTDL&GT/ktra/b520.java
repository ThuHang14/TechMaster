package ktra;

public class b520 {
    public static void main(String[] args) {
        System.out.println(DetectCapitalUse("FlaG"));
    }

    public static boolean DetectCapitalUse(String word) {
        String w1 = word.toUpperCase();
        String w2 = word.toLowerCase();
        String[] w = word.split("");
        String w3 = w[0].toUpperCase();
        for (int i = 1; i < w.length; i++) {
            w3 += w[i].toLowerCase();
        }
        return (word == (w1) || word == (w2) || word.equals(w3));
    }
}
