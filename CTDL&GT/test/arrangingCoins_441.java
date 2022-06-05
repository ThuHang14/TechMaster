package test;

public class arrangingCoins_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(20));
        System.out.println(arrangeCoins(1804289383));
        System.out.println(arrangeCoins(-1804289383));
    }

    public static int arrangeCoins(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("noooo");
//        }
        // return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);

        int step = 1;
        while (step <= n) {
            n -= step;
            step++;
        }

        return step - 1;
    }
}
