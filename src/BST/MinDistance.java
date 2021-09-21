package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class MinDistance {
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
    ArrayList<Integer> list = new ArrayList();
    ArrayList inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);
        }
        return list;
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
        MinDistance obj = new MinDistance();
        int array [] = {1,10,23,90,102};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
        ArrayList<Integer> val = obj.inOrder(root);
        int dist = Math.abs(val.get(0)-val.get(1));
        for(int i=1;i<val.size()-1;i++){
            int data =  Math.abs(val.get(i)-val.get(i+1));
            if(data<dist)
                dist = data;
        }
        System.out.println(dist);
    }
}
