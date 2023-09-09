package ashraf.rnd.leetcode.minimumsumtriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Integer[][] triangle = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
//        Integer[][] triangle = {{-1}, {2, 3}, {1, -1, -3}};


        List<List<Integer>> twoDList = Arrays.stream(triangle)
                .map(Arrays::asList)
                .toList();


    }



    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> converted = new ArrayList<>();
        converted.add(triangle.get(0));

        for (int i = 1; i < triangle.size(); i++) {
            converted.add(getConvertedRow(converted.get(i-1),triangle.get(i)));
        }

        return converted.get(converted.size()-1).stream()
                .min(Integer::compareTo).orElse(0);
    }

    List<Integer> getConvertedRow(List<Integer> prevRow, List<Integer> currentRow){
        List<Integer> convertedRow = new ArrayList<>();
        for (int i = 0; i < currentRow.size(); i++) {
            if (i==0){
                convertedRow.add(prevRow.get(i) + currentRow.get(i));
            }else if(i==currentRow.size()-1){
                convertedRow.add(prevRow.get(i-1)+currentRow.get(i));
            }else {
                Integer temp1 = prevRow.get(i-1)+currentRow.get(i);
                Integer temp2 = prevRow.get(i)+currentRow.get(i);
                if (temp1<temp2){
                    convertedRow.add(temp1);
                }else {
                    convertedRow.add(temp2);
                }
            }

        }
        return convertedRow;
    }

}
