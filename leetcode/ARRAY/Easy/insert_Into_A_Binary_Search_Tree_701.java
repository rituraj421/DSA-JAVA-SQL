package leetcode.ARRAY.Easy;

public class insert_Into_A_Binary_Search_Tree_701 {

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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            if (val < root.val)
                root.left = insertIntoBST(root.left, val);
            else if (val > root.val)
                root.right = insertIntoBST(root.right, val);
            return root;
        }
    }
}
