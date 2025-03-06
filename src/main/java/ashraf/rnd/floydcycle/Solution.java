package ashraf.rnd.floydcycle;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */

@Slf4j
public class Solution {

    public static void main(String[] args) {
        int n = 19;
        FloydCycle fc = new FloydCycle();
        LinearCycle lc = new LinearCycle();
        log.info("isHappy : fc: {}, lc: {}", fc.isHappy(n), lc.isHappy(n));
    }


}
