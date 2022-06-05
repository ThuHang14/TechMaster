package ss3;

public class checkifTwoString_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1)
                .equals(String.join("", word2));

//        String arr1 = "", arr2 = "";
//        for (int i = 0; i < word1.length; i++) {
//            arr1 += word1[i];
//        }
//        for (int i = 0; i < word2.length; i++) {
//            arr2 += word2[i];
//        }
//        return arr1.equals(arr2);
    }
}
