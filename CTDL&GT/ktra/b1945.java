package ktra;

public class b1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzxxxxzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 2));
        System.out.println(getLucky("iaozzbyqzwbpurzze", 2));//5
        System.out.println(getLucky("vbyytoijnbgtyrjlsc", 2)); //15

        System.out.println("\n"+getLucky2("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzxxxxzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 2));
        System.out.println(getLucky2("iaozzbyqzwbpurzze", 2));//5
        System.out.println(getLucky2("vbyytoijnbgtyrjlsc", 2)); //15
    }

    public static int getLucky(String s, int k) {
        char[] chars = s.toUpperCase().toCharArray();
        int[] ints = new int[200];
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - 64;
        }
        for (int i = 0; i < ints.length; i++) {
            sum += soDu(ints[i]);
        }
       if(k>1){
           while (k >0){
        sum = soDu(sum);
           k--;}
               return sum;
       }
        return sum;
    }

    public static int soDu(int a) {
        a = a % 10 + a / 10;
        return a;
    }

    public static int getLucky2(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            sb.append(s.charAt(i)-'a'+1);
        }
        String str=sb.toString();
        int result=0;
        while (k>0){
            result=0;
            for (int i=0;i<str.length();i++){
                result+=Character.getNumericValue(str.charAt(i));
            }
            str=String.valueOf(result);

            k--;
        }

        return result;
    }
}
