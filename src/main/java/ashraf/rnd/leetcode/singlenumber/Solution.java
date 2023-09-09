package ashraf.rnd.leetcode.singlenumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int []nums = {3,3,7,7,10,11,11};

        System.out.println("nums = " + getSingleFromSortedArray(nums));


//        Map<Integer, Integer> triplet = getSingleFromTripple(nums);
//        System.out.println("triplet = " + triplet.keySet().toArray()[0]);

//        Object[] numberSet = getSingleFromDouble(nums).toArray();
//        var temp = new int[]{(int)numberSet[0],(int)numberSet[1]};
//        System.out.println("numberSet = " + numberSet);
    }

    private static int getSingleFromSortedArray(int[] nums) {
        for (int i = 0; i < nums.length-1; i=i+2) {
            if (nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    private static Map<Integer, Integer> getSingleFromTripple(int[] nums) {
        Map<Integer,Integer> triplet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (triplet.containsKey(nums[i])){
                if (triplet.get(nums[i])<2){
                    triplet.put(nums[i],triplet.get(nums[i])+1);
                }else {
                    triplet.remove(nums[i]);
                }
            }else {
                triplet.put(nums[i],1);
            }
        }
        return triplet;
    }

    private static Set<Integer> getSingleFromDouble(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            if (numberSet.contains(num)) {
                numberSet.remove(num);
            } else
                numberSet.add(num);
        }
        return numberSet;
    }
}
