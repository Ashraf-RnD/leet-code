package ashraf.rnd.leetcode;

import ashraf.rnd.leetcode.islandcount.Solution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetCodeApplication.class, args);

        //200
        Solution islandCount = new Solution();
        islandCount.numIslands();



    }

}
