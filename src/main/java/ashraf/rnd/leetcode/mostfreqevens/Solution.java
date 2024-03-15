package ashraf.rnd.leetcode.mostfreqevens;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        int []nums = new int[]{0,1,2,2,4,4,1};

        System.out.println("mostFrequentEven = " + mostFrequentEven(nums));


    }

    public static int mostFrequentEven(int[] nums) {

        Map<Integer,Integer> freqMap = new HashMap<>();
        int target = -1;
        int maxFreq = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                int freq = 1;
                if (freqMap.containsKey(num)){

                    freq += freqMap.get(num);
                    freqMap.put(num, freq);
                }else {
                    freqMap.put(num, freq);

                }

                if (freq > maxFreq) {
                    maxFreq = freq;
                    target = num;
                } else if (freq == maxFreq && num < target) {
                    target = num;
                }


            }
        }

        return target;
    }

}

