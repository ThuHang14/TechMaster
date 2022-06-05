package hash;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class b202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        while (set.add(n)) {
            if (n == 1) return true;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
            sum = 0;
        }
        return false;
    }
}
