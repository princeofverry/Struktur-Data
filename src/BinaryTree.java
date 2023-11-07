//class TreeNode {
//    int data;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class BinaryTree {
//    TreeNode root;
//
//    public BinaryTree(int data) {
//        root = new TreeNode(data);
//    }
//
//    public void printInOrder(TreeNode node) {
//        if (node != null) {
//            printInOrder(node.left);
//            System.out.print(node.data + " ");
//            printInOrder(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree(4);
//        tree.root.left = new TreeNode(2);
//        tree.root.right = new TreeNode(6);
//        tree.root.left.left = new TreeNode(1);
//        tree.root.left.right = new TreeNode(3);
//
//        System.out.println("Inorder Traversal:");
//        tree.printInOrder(tree.root);
//    }
//}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null; //gausa karena udh null
        this.right = null; //gausa dipake karena udh pasti null
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(11);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);


    }

}



