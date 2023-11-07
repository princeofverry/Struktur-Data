class NodeAVL {
    int data;
    NodeAVL left;
    NodeAVL right;
    int height;

    NodeAVL(int data) {
        this.data = data;
        this.height = 1;
    }
}

public class AVLTree {
    NodeAVL root;

    int height(NodeAVL node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    int getBalance(NodeAVL node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    NodeAVL rightRotate(NodeAVL y) {
        NodeAVL x = y.left;
        NodeAVL T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    NodeAVL leftRotate(NodeAVL x) {
        NodeAVL y = x.right;
        NodeAVL T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    NodeAVL insert(NodeAVL node, int data) {
        if (node == null) {
            return new NodeAVL(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1) {
            if (data < node.left.data) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (data > node.right.data) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    void insert(int data) {
        root = insert(root, data);
    }

    NodeAVL search(NodeAVL node, int data) {
        if (node == null || node.data == data) {
            return node;
        }

        if (data < node.data) {
            return search(node.left, data);
        }

        return search(node.right, data);
    }

    boolean search(int data) {
        return search(root, data) != null;
    }

    NodeAVL delete(NodeAVL node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.data) {
            node.left = delete(node.left, data);
        } else if (data > node.data) {
            node.right = delete(node.right, data);
        } else {
            if (node.left == null || node.right == null) {
                NodeAVL temp = (node.left != null) ? node.left : node.right;
                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                NodeAVL temp = findMin(node.right);
                node.data = temp.data;
                node.right = delete(node.right, temp.data);
            }
        }

        if (node == null) {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1) {
            if (getBalance(node.left) >= 0) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (getBalance(node.right) <= 0) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    void delete(int data) {
        root = delete(root, data);
    }

    NodeAVL findMin(NodeAVL node) {
        NodeAVL current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    void preOrderTraversal(NodeAVL node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        System.out.println("Pohon AVL setelah penyisipan:");
        tree.preOrderTraversal(tree.root);

        int searchData = 20;
        if (tree.search(searchData)) {
            System.out.println("\nData " + searchData + " ditemukan dalam pohon AVL.");
        } else {
            System.out.println("\nData " + searchData + " tidak ditemukan dalam pohon AVL.");
        }

        tree.delete(20);
        System.out.println("Pohon AVL setelah penghapusan:");
        tree.preOrderTraversal(tree.root);
    }
}
