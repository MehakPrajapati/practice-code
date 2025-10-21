package leetcode;

import java.util.*;

public class leet239 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int[] result = max(arr, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] max(int[] arr, int k) {
        Deque<Integer> q = new LinkedList<>();
        int[] ans = new int[arr.length - k + 1];
        int j = 0;

        // process first window
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                q.pollLast();
            }
            q.addLast(i);
        }

        ans[j++] = arr[q.peekFirst()];

        // process remaining windows
        for (int i = k; i < arr.length; i++) {
            // remove smaller elements from back
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                q.pollLast();
            }
            q.addLast(i);

            // remove out-of-window index
            if (!q.isEmpty() && q.peekFirst() == i - k) {
                q.pollFirst();
            }

            ans[j++] = arr[q.peekFirst()];
        }

        return ans;
    }
}
