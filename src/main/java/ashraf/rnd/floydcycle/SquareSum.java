package ashraf.rnd.floydcycle;

/**
 * @Date : 6/3/25
 * @Author : Md. Ashraful Alam
 */
public abstract class SquareSum {

    protected int getSumSquare(int n) {
        int sum = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += Math.multiplyExact(digit, digit);
        }
        return sum;

    }

    //faster
    protected int getSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.multiplyExact(digit, digit);
            n = n / 10;
        }
        return sum;
    }
}
