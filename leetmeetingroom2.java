package leetcode;

import java.util.*;

public class leetmeetingroom2 {
    public static void main(String[] args) {
        int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
        // Arrays.sort(intervals, ((a, b) -> a[0] - b[0])); // solve the 2d arrays this
        // method- according to accending
        // // expresion = lemda expression = ((a , b) -> a[0] - b[0]));
        // for (int i = 0; i < intervals.length; i++) {
        // System.out.println(intervals[i][0] + " " + intervals[i][1]);
        // }
        // }\
    }

    public static int meetingroom(int[][] intervals) {

        Arrays.sort(intervals, ((a, b) -> a[0] - b[0]));
        PriorityQueue<int[][]> pq = new PriorityQueue<>();
        pq.add(intervals);
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] >= pq.peek()) {
                pq.poll();
            }
            pq.add(intervals(i));
        }
        return pq.size();
    }

    private static int[][] intervals(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intervals'");
    }
}
