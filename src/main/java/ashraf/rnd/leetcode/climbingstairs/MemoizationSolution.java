package ashraf.rnd.leetcode.climbingstairs;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful AlamLtd
 */
public class MemoizationSolution {

    public int getTotalWays(int n) {
        int[] memory = new int[n];

        for (int i = 0; i < memory.length; i++) {
            if (i == 0) {
                memory[i] = 1;
            } else if (i == 1) {
                memory[i] = 2;
            } else {
                memory[i] = memory[i - 1] + memory[i - 2];
            }
        }

        return memory[n - 1];

    }

}
