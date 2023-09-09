package ashraf.rnd.leetcode.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int numRows = 1;

        List<List<Integer>> triangle = getPascalTriangle(numRows);
        System.out.println("triangle = " + triangle);
        System.out.println("triangle = " + triangle.get(0));

    }

    private static List<List<Integer>> getPascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = List.of(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j <i ; j++) {
                newRow.add(previousRow.get(j-1)+previousRow.get(j));
            }
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }
}
