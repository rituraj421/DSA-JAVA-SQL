package leetcode.ARRAY.Easy;

import java.util.ArrayList;
import java.util.List;

// import javax.swing.tree.TreeNode;

public class binary_Tree_Preorder_Traversal_144 {

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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorderTraversal(root, result);
            return result;
        }

        private void preorderTraversal(TreeNode node, List<Integer> result) {
            if (node == null) {
                return;
            }
            result.add(node.val);
            preorderTraversal(node.left, result);
            preorderTraversal(node.right, result);
        }
    }

}
