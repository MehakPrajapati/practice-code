package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leet350 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };

    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
                ll.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        int[] ans = new int[ll.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ll.get(i);

        }
        return ans;
    }
}
