package leetcode;

public class leet713 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 5 };
        int k = 10;
        System.out.println(product(arr, k));
    }

    public static int product(int[] arr, int k) {
        int ans = 0;
        int p = 1;
        int si = 0;
        int ei = 0;
        while (ei < arr.length) { // grow
            p = p + arr[ei];

            // shrink
            while (p >= k && si <= ei) {
                p = p / arr[si];
                si++;
            }
            // ans

            ans += (ei - si + 1);
            ei++;

        }
        return ans;
    }
}
