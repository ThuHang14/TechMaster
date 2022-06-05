package hash;

import java.util.HashSet;
import java.util.Set;

public class b217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for (int s: nums
             ) {
            dup.add(s);
        }
        return dup.size() != nums.length;
    }
}
