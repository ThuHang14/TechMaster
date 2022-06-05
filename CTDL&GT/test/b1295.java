package test;

public class b1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for ( int n : nums
             ) {
            String a = ""+n;
            if(a.length()%2 ==0 ){
                count++;
            }
        }
        return count;
    }
}
