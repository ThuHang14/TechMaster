package ktra;

import java.security.SecureRandom;
import java.util.*;

public class b179_l {
    public static void main(String[] args) {
//        int a[] = {9, 80, 2, 71, 32, 12, 10};
//        System.out.println(largestNumber(a));

        Random r = new java.util.Random ();
        String s = Long.toString (r.nextLong () & Long.MAX_VALUE, 36);
        System.out.println(s);

       String random = UUID.randomUUID().toString().replace("-", "");
        System.out.println(random.substring(8));

        System.out.println(getRandomString(8));
    }
    public static String getRandomString( int dodai) {

        String result = "";
        String UPPER = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String RANDOM = UPPER+"1234567890"+UPPER.toLowerCase();

        for (int i = 0; i < dodai; i++) {
            int temp = (int) Math.round(Math.random() * RANDOM.length());
            result += RANDOM.charAt(temp);
        }
        return result;
    }

    public static String largestNumber(int[] nums) {
        String sum = "";
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        for (int i = 0; i < str.length ; i++) {
            sum+= str[i];
        }
if(str[0].equals("0")){
    return "0";
}
        return sum;
    }

    public static int chiaDu(int a) {
        while (a > 9) {
            a /= 10;
        }
        return a;
    }
}
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 9) {
//                String[] str = String.valueOf(nums[i]).split("");
//                List<String> listBonus = List.of(str);
//                list.addAll(listBonus);
//            } else {
//                list.add(String.valueOf(nums[i]));
//            }
//        }
//
//        list.sort(Comparator.reverseOrder());
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }