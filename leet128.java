package leetcode;

// import java.util.HashSet;
import java.util.HashSet;

public class leet128 {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
    }

    public static int longest(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i];
            if (!set.contains(s - 1)) {
                int c = 0;
                while (!set.contains(s)) {
                    set.remove(s);
                    c++;
                    s++;

                }
                ans = Math.max(ans, c);
            }

        }
        return ans;
    }
}
