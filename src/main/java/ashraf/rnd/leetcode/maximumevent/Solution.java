package ashraf.rnd.leetcode.maximumevent;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
//        int [][] events = {{1,2},{2,3},{3,4}};
//        int [][] events = {{1,2},{1,2},{3,3},{1,5},{1,5}};

        int[][] events = {{1, 2}, {1, 2}, {1, 6}, {1, 2}, {1, 2}};
        System.out.println("maxEvents(events) = " + maxEvents(events));
    }

    public static int maxEvents(int[][] events) {

        Set<Integer> event = new HashSet<>();
        int eventCount = 0;

        for (int i = 0; i < events.length; i++) {
            System.out.print("i = " + i + " ==> ");
            boolean newEvent = false;
            for (int j = events[i][0]; j <= events[i][1]; j++) {
                if (!event.contains(j)) {
                    newEvent = true;
                }
                System.out.println("j = " + j);
                event.add(j);
            }
            if (newEvent) {
                eventCount++;
            }
        }

        System.out.println("event = " + event.toString());
        return eventCount;

    }
}
