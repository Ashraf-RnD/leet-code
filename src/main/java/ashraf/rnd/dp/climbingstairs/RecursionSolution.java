package ashraf.rnd.dp.climbingstairs;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */
public class RecursionSolution {

    public int climbStairs(int n) {

        int totalWays = 0;

        if (n == 1) {
            totalWays = 1;
        }
        if (n == 2) {
            totalWays = 2;
        }


        for (int i = 3; i <= n; i++) {
            totalWays = climbStairs(i - 1) + climbStairs(i - 2);
        }

        return totalWays;
    }

}
