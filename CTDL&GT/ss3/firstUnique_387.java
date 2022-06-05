package ss3;

public class firstUnique_387 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String s2 = "aabb";
        System.out.println(firstUniqChar(s2));

        String s3 = "loveleetcode";
        System.out.println(firstUniqChar(s3));

    }

    public static int firstUniqChar(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            char text = s.charAt(i);
//            if (s.lastIndexOf(text) == s.indexOf(text)) {
//                return i;
//            }
//        }
        char[] arr = s.toCharArray();
        int[] k = new int['z' + 1];
        for (int i = 0; i < arr.length; i++) {
            k[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (k[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
}
