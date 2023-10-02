package ashraf.rnd.dp.catalan;

public class RecursiveCatalan {

    public int getCatalan(int n){
        int catNum = 0;

        if (n<=1){
            return 1;
        }
        for (int i = 0; i < n; i++) {
            catNum += getCatalan(i) * getCatalan(n-i-1);
        }

        return catNum;
    }
}
