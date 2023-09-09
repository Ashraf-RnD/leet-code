package ashraf.rnd.leetcode.twosum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public static void main(String[] args) {

//        int [] numbers = {2,7,11,15};
        int [] numbers = {-1,0};
        int target = -1;
        log.info("twoSum = {},{}" , twoSum(numbers,target)[0],twoSum(numbers,target)[1]);

    }

    public static int[] twoSumPointer(int[] numbers, int target) {

        int pointerOne = 0;
        int pointerTwo = numbers.length-1;

        while (pointerOne<=pointerTwo){

            int sum = numbers[pointerOne]+numbers[pointerTwo];

            if (sum>target){
                pointerTwo--;
            } else if (sum<target) {
                pointerOne++;
            }else {
                return new int[]{pointerOne+1,pointerTwo+1};
            }
        }

        return new int[]{pointerOne+1,pointerTwo+1};
    }
    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

}
