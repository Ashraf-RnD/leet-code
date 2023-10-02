package ashraf.rnd.dp.catalan;

public class DPCatalan {

    public int getCatalan(int n){
        int []catNum = new int [n+2];
        catNum[0] = 1;
        catNum[1] = 1;


        for (int i = 2; i <=n; i++) {

            catNum[i] = 0;
            for (int j = 0; j < i; j++) {
                catNum[i] += catNum[j] * catNum[i-j-1];
            }


        }

        return catNum[n];
    }
}
