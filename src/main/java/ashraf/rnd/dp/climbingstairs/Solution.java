package ashraf.rnd.dp.climbingstairs;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date : 5/3/25
 * @Author : Md. Ashraful Alam
 */
@Slf4j
public class Solution {

    public static void main(String[] args) {
        int stairs = 6;
        MemoizationSolution ms = new MemoizationSolution();
        log.info("stairs = {} way-one: {}, way-two: {}", stairs, ms.getTotalWays(stairs), getTotalSteps(stairs));
    }



    public static int getTotalSteps(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int first = 1, second = 2, totalWays = 0;

        for (int i = 3; i <= n; i++) {
            totalWays = first + second;
            first = second;
            second = totalWays;
        }

        return totalWays;
    }


}
