package GFG_13_BST;

// import LinkedList.singlyLinkedList.L.Node;

class bNode{
    int key;
    bNode left;
    bNode right;

    bNode(int k){
        key = k;
    }

}
public class sheet_1 {

    public static bNode insert(bNode root,int k){
        if(root==null)
            return new bNode(k);
        else if(root.key<k)
            root.right=insert(root.right,k);
        else if(root.key>k)
            root.left=insert(root.left,k);
        return root;
    }

    public static void inorder(bNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }    
    } 
    // floor in bst
    public static bNode floor(bNode root, int x){
        bNode res = null;
        while(root!=null){
            if(root.key == x){
                return root;
            }
            else if(root.key>x){
                root = root.left;
            }
            else{
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    // ceil
    public static bNode ceil(bNode root, int y){
        bNode res = null;
        while(root!=null){
            if(root.key == y){
                return root;
            }
            else if(root.key<y){
                root = root.right;
            }
            else{
                res = root;
                root = root.left;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        bNode root=new bNode(10);
    	root.left=new bNode(5);
    	root.right=new bNode(15);
    	root.right.left=new bNode(12);
    	root.right.right=new bNode(18);
    	int x=20;

        root = insert(root, x);
        inorder(root);

        System.out.println();
        System.out.println("floor");
        // root = floor(root, 17);
        System.out.println(floor(root, 15).key);

        System.out.println("ceil");
        System.out.println(ceil(root, 13).key);
    }
}
