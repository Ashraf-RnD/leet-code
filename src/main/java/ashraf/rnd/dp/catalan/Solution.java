package ashraf.rnd.dp.catalan;

public class Solution {

    //Catalan: Cn = (2n)!/(n+1)!n!
    //n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862
    public static void main(String[] args) {

        RecursiveCatalan rc = new RecursiveCatalan();

        int catNum = rc.getCatalan(5);
        System.out.println("catNum = " + catNum);

        DPCatalan dpCatalan = new DPCatalan();
        int catNum2 = dpCatalan.getCatalan(5);
        System.out.println("catNum2 = " + catNum2);
    }
}
