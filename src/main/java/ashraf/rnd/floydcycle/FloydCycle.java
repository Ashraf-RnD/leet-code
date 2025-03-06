package ashraf.rnd.floydcycle;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */

@Slf4j
public class FloydCycle extends SquareSum {

    public boolean isHappy(int n) {

        int oneStep = n, twoStep = n;
        while (true) {

            oneStep = getSumSquare(oneStep);
            twoStep = getSumSquare(getSumSquare(twoStep));

            //break on cycle
            if (oneStep == twoStep) {
                if (oneStep == 1) {
                    return true;
                } else {
                    log.info("Cycle detected:: oneStep : {} twoStep : {}", oneStep, twoStep);
                    return false;
                }
            }
        }
    }

}
