package ashraf.rnd.leetcode.islandcount;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public int numIslands() {

        String[][] grid = {
                {"1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "1"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "0"}
        };

        log.info("grid = {}",grid.length);

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].equals("1")){
                    count++;
                    callBfs(grid, i, j);
                }
            }
        }

        log.info("count = " + count);

        return count;
    }

    private void callBfs(String[][] grid, int i, int j) {
//        log.info("grid: {},{}",i,j);
        if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j].equals("0")){// boundary check
//            log.info("grid: Kabum");
            return;
        }
        grid[i][j]="0";
        callBfs(grid,i+1,j);//up
        callBfs(grid,i-1,j);//down
        callBfs(grid,i,j-1);//left
        callBfs(grid,i,j+1);//right
    }
}
