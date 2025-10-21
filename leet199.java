package leetcode;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class leet199 {
    class Solution {
        int max_deapth = 0;

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            righttreesidee(root, ll, 1);
            return ll;
        }

        public void righttreesidee(TreeNode root, List<Integer> ll, int curr) {

            if (root == null) {
                return;
            }
            if (max_deapth < curr) {
                ll.add(root.val);
                max_deapth = curr;
            }
            righttreesidee(root.right, ll, curr + 1);
            righttreesidee(root.left, ll, curr + 1);
        }
    }

}
