package ss6;

public class b344 {
    public static void main(String[] args) {
char s [] = {'f','u','c','k'};
ReverseString(s);
        System.out.println(s);
    }
    public static void ReverseString(char[] s) {
        for (int i = 0,j=s.length-1; i <j ; i++,j--) {
            char b = s[i];
            s[i] = s[j];
            s[j] = b;
        }
    }
}
