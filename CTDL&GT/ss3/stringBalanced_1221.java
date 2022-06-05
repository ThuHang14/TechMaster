package ss3;

public class stringBalanced_1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        //"RLLLLRRRLR";
        //"LLLLRRRR";
        //"RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'L') count--;

            else count++;

            if (count == 0) result++;
        }
        return result;
    }
}
