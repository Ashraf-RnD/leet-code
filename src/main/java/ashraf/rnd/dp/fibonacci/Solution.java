package ashraf.rnd.dp.fibonacci;

public class Solution {

    //Fibonacci : Fn = Fn-1 + Fn-2

    public static void main(String[] args) {

        int fib = getFibs(6);

        System.out.println("fib = " + fib);
    }

    private static int getFibs(int n) {
        int size = n + 2;

        int[] fib = new int[size];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < size; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
