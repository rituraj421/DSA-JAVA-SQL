package GFG_12_TREE;

import java.util.LinkedList;
import java.util.Queue;

class tNode {
    int key;
    tNode left;
    tNode right;

    tNode(int k) {
        key = k;
    }
}

public class sheet_1 {
    // inorder traversal(from left bottom -> root -> right)
    static void inorder(tNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // preorder traversal (here we first process the roort -> left -> right)
    static void preorder(tNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // postorder traversal(first we process the left -> right ->root)
    static void postorder(tNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    // height of a tree
    static int height(tNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // kth node
    static void kth(tNode root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.key + " ");
        }
        kth(root.left, k - 1);
        kth(root.right, k - 1);

    }

    // level order traversal(breadth first search) we need to ptint levelwise
    static void levelOrder(tNode root) {
        if (root == null) {
            return;
        }
        Queue<tNode> q = new LinkedList<tNode>();
        q.add(root);
        while (q.isEmpty() == false) {
            tNode curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    // size of binary tree
    static int sizeBinary(tNode root){
        if(root == null){
            return 0;
        }
        return sizeBinary(root.left) + sizeBinary(root.right)+1;
    }
    public static void main(String[] args) {
        tNode root = new tNode(1);
        root.left = new tNode(2);
        root.right = new tNode(30);
        root.right.right = new tNode(31);
        root.left.left = new tNode(40);

        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("preorder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);

        System.out.println();
        System.out.println("height");
        System.out.println(height(root));

        kth(root, 2);

        System.out.println("Level order traversal");
        levelOrder(root);

        System.out.println();
        System.out.println("SIze of binary treee");
        System.out.println(sizeBinary(root));
    }
}
