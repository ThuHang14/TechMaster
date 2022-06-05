package ss6;

public class nhiPhan {
    public static void main(String[] args) {
        int [] s = {1,6,7,9,12,14,52,96,78,100};
        System.out.println(nhiPhan(s,9));
    }
    public static int nhiPhan(int[] s,int num){
         int L = 0;
        int R = s.length;
        while (L==R){
            int sum = (L+R)/2;
            if (s[sum] == num) {
                return sum;
            } else if (s[sum] > num) {
               R = sum-1;
            } else {
                L = sum+1;
            }
        }
        return -1;
    }
}
