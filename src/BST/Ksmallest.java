package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class Ksmallest {
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
    ArrayList <Integer>list = new ArrayList();
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);
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
        Ksmallest obj = new Ksmallest();
       int num = scan.nextInt();
        int array [] = {20,22,4,8,12,10,14};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
        obj.inOrder(root);
        int sum =0;
        for(int i=0;i<num;i++){
            sum+=obj.list.get(i);
        }
        System.out.println(sum);
    }
}
