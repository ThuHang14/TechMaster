package result;

import java.util.*;

public class b1122 {
    public static void main(String[] args) {
        int[] a = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] b = {2,42,38,0,43,21};
        System.out.println(Arrays.toString(relativeSortArray(a, b))
        );
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        List<Integer> myList = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int a : arr1
        ) {
            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
        }
        int i = 0;
        for (int a : arr2
        ) {
            if (myMap.get(a) > 1) {
                int count = myMap.get(a);
                while (count != 0) {
                    result[i++] = a;
                    count--;
                    myMap.remove(a);
                }
            } else {
                result[i++] = a;
                myMap.remove(a);
            }
        }
        for (var a : myMap.entrySet()
        ) {
            if (a.getValue() > 1) {
                int count = a.getValue();
                while (count != 0) {
                    myList.add(a.getKey());
                    count--;
                }
            }else {
            myList.add(a.getKey());}
        }
        myList.sort(Comparator.naturalOrder());
        for (int j = i, k = 0; j < result.length; j++, k++) {
            result[j] = myList.get(k);
        }
        return result;
    }
}
