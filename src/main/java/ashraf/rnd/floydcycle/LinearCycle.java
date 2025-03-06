package ashraf.rnd.floydcycle;

import java.util.HashSet;


/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */
public class LinearCycle extends SquareSum {

    public boolean isHappy(int n){

        HashSet<Integer> set = new HashSet<>();

        while (true){
            n = getSquareSum(n);
            if (n == 1){
                return true;
            }
            if (set.contains(n)){
                return false;
            }
            set.add(n);
        }


    }


}
