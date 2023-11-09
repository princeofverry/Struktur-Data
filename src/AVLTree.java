class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class NodeAVL {
    Contact contact;
    NodeAVL left;
    NodeAVL right;
    int height;

    NodeAVL(Contact contact) {
        this.contact = contact;
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

    NodeAVL insert(NodeAVL node, Contact contact) {
        if (node == null) {
            return new NodeAVL(contact);
        }

        // Compare contacts based on name or phone number, whichever you prefer.
        int compareResult = contact.name.compareTo(node.contact.name);

        if (compareResult < 0) {
            node.left = insert(node.left, contact);
        } else if (compareResult > 0) {
            node.right = insert(node.right, contact);
        } else {
            // Contact with the same name already exists, handle as needed.
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1) {
            if (compareResult < 0) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (compareResult > 0) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    void insert(Contact contact) {
        root = insert(root, contact);
    }

    NodeAVL search(NodeAVL node, String name) {
        if (node == null || node.contact.name.equals(name)) {
            return node;
        }

        int compareResult = name.compareTo(node.contact.name);

        if (compareResult < 0) {
            return search(node.left, name);
        } else {
            return search(node.right, name);
        }
    }

    Contact search(String name) {
        NodeAVL resultNode = search(root, name);
        return (resultNode != null) ? resultNode.contact : null;
    }

    NodeAVL delete(NodeAVL node, String name) {
        // Implement contact deletion logic here.
        // Similar to the insertion logic, you'll need to handle balance.

        return node;
    }

    void delete(String name) {
        root = delete(root, name);
    }

    void preOrderTraversal(NodeAVL node) {
        if (node != null) {
            System.out.println("Name: " + node.contact.name + ", Phone Number: " + node.contact.phoneNumber);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree phoneBook = new AVLTree();

        phoneBook.insert(new Contact("Jems", "123-456-7890"));
        phoneBook.insert(new Contact("Asep", "987-654-3210"));
        phoneBook.insert(new Contact("Edi", "555-123-4567"));

        System.out.println("Phone Book entries:");
        phoneBook.preOrderTraversal(phoneBook.root);

        String searchName = "Asep";
        Contact foundContact = phoneBook.search(searchName);
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact.name + " - " + foundContact.phoneNumber);
        } else {
            System.out.println("Contact not found for name: " + searchName);
        }

        // Implement contact deletion logic as needed.
    }
}
