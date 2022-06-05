package hash;

public class sample {
    public static void main(String[] args) {
        String a[] = {"aa", "ab", "ccc"};
        String b[] = {"aa", "ba", "cz"};

        int[] c = {2, 3, 44};
        int[] d = {22, 3, 44};
        findInt(c, d);
    }

    public static void findInt(int[] in, int[] input) {
        boolean[] count = new boolean[1000];
        for (int i = 0; i < in.length; i++) {
            count[in[i]] = true;
        }
        for (int x : input
        ) {
            System.out.println(count[x] ? "True" : "False");
        }
    }

    public static void findStr(String[] input, String[] testCase) {
        String[] count = new String[1000];
    }
}
