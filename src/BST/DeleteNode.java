package BST;

import java.util.Scanner;

public class DeleteNode{

    static class Node
    {
        int key;
        Node left, right;
    }


    static Node newNode(int item)
    {
        Node temp = new Node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }

    static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    static Node insert(Node node, int key)
    {

        if (node == null)
            return newNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);
        return node;
    }

    static Node deleteNode(Node root, int k)
    {

        if (root == null)
            return root;

        if (root.key > k)
        {
            root.left = deleteNode(root.left, k);
            return root;
        }
        else if (root.key < k)
        {
            root.right = deleteNode(root.right, k);
            return root;
        }

        if (root.left == null)
        {
            Node temp = root.right;
            return temp;
        }
        else if (root.right == null)
        {
            Node temp = root.left;
            return temp;
        }
        else
        {
            Node succParent = root;
            Node succ = root.right;

            while (succ.left != null)
            {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
            root.key = succ.key;

            return root;
        }
    }

    public static void main(String args[])
    {

        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Inorder traversal of the " +
                "given tree");
        inorder(root);
        Scanner scan = new Scanner(System.in);
        deleteNode(root, scan.nextInt());
        System.out.println("After Deletion");
        inorder(root);
    }
}
