package result;

import java.util.ArrayList;
import java.util.List;

public class b1773 {
    public static void main(String[] args) {
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int arr = 0;
        List<String> my = new ArrayList<>();
        if (ruleKey.contains("name")) {
            arr = 2;
        } else if (ruleKey.equals("color")) {
            arr = 1;
        }
        for (List a : items
        ) {
            String str = "" + a.get(arr);
           my.add(str);
        }
        for (String a : my
             ) {
            if(ruleValue.contains(a)){
                count++;
            }else {

            }
        }
        return count;
    }
}
