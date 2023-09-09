package ashraf.rnd.leetcode.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println("nums = " +  extracted(nums));
    }

    private static boolean extracted(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}
