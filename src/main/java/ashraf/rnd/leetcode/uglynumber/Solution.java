package ashraf.rnd.leetcode.uglynumber;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(8));
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int n){
        while (true){
            if (n==0){
                return false;
            } else if (n==1) {
                return true;
            } else if (n%2==0) {
                n = n/2;
            } else if (n%3==0) {
                n = n/3;
            } else if (n%5==0) {
                n = n/5;
            }else {
                return false;
            }
        }
    }

}
