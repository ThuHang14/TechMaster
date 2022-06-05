package result;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class b394 {//2:32
    public static void main(String[] args) {
        decodeString("3[a2[c3[d]]]");
    }
    public static String decodeString(String s) {
        Stack<Character> num = new Stack<>();
        Stack<String> str = new Stack<>();
        List<String> list = new ArrayList<>();
        for (char a : s.toCharArray()
             ) {
            if(a == '['){
                str.push(String.valueOf(a));
            }else if(Character.isDigit(a)){
                num.push(a);
            }else if(Character.isLetter(a)){
                str.push(String.valueOf(a));
            }
        }
        System.out.println(num);
        System.out.println(str);
        for (int i = s.length()-1; i <=0 ; i--) {
            if(s.charAt(i) == ']'){
                String a = "";
                while (str.pop() != "["){
                    a +=  str.pop();
                    String pop = a;
                    int count = num.pop();
                    while (count != 0){
                        a += pop;
                    }
                }
                str.push(a);
            }
            if(s.charAt(i) == '['){
                list.add(str.pop());
                num.pop();
            }
        }
        System.out.println(num);
        System.out.println(str);
        System.out.println(list);
        return "";
    }
}
