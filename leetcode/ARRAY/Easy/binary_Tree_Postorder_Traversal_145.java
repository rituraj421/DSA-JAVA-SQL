package leetcode.ARRAY.Easy;

import java.util.ArrayList;
import java.util.List;

public class binary_Tree_Postorder_Traversal_145 {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            postorderTraversal(root, result);
            return result;
        }

        private void postorderTraversal(TreeNode node, List<Integer> result) {
            if (node == null) {
                return;
            }
            postorderTraversal(node.left, result);
            postorderTraversal(node.right, result);
            result.add(node.val);
        }
    }

}
