package ss6;

public class b1816 {
    public static void main(String[] args) {
String s = "he hi hu ha";
        System.out.println(truncateSentence(s, 2));
    }

    public static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                s2.append(arr[i]);
            } else {
                s2.append(arr[i]).append(" ");
            }

        }
        return s2.toString();
    }
}
