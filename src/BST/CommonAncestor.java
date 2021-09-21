package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonAncestor {
ArrayList one = new ArrayList();
    ArrayList findAncestor(Node root,int key){
        if(root ==null){
            System.out.println("No tree");
            System.exit(0);
        }
        if(key< root.data){
            if(root.left!=null) {
                one.add(root.data);
                findAncestor(root.left, key);
            }
            else
                one.add(root.data);
        }
        else if(key>root.data){
            if(root.right!=null) {
                one.add(root.data);
                findAncestor(root.right, key);
            }
            else
                one.add(root.data);
        }
        return one;
    }
    Node insert(Node node,int data){
        if(node == null){
            return createNode(data);
        }
        if(data< node.data){
            node.left = insert(node.left,data);
        }
        else if(data>node.data){
            node.right = insert(node.right,data);
        }
        else {
            System.out.println("Can't insert The node due to Duplication");
            System.exit(0);
        }

        return node;
    }
    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public Node createNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left=null;
        newNode.right=null;
        return newNode;
    }
    class Node {
        int data;
        Node left, right;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node root = null;
        CommonAncestor obj = new CommonAncestor();
        int array [] = {5,6,7,8,3,4};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
        preOrder(root);
       int n1 = scan.nextInt();
       int n2 = scan.nextInt();
       obj.findAncestor(root,n1);
        obj.findAncestor(root,n2);
        if(obj.one.contains(n1))
            System.out.println(n1);
        else if(obj.one.contains(n2))
            System.out.println(n2);
        else
        System.out.println(obj.one.get(obj.one.size()-1));
    }
}
