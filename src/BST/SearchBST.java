package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchBST {
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
    ArrayList list = new ArrayList();
    ArrayList<Integer> search(Node root,int key){
        if(root ==null)
            return null;
        if(key<root.data){
            if(root.left!=null){
                search(root.left,key);
            }
        }
        else if(key> root.data){
            if(root.right!=null){
                search(root.right,key);
            }
        }
        else if(key == root.data){
            list.add(root.data);
            if(root.left!=null)
                list.add(root.left.data);
            if(root.right!=null)
                list.add(root.right.data);
            return list;
        }
       return null;
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
        SearchBST obj = new SearchBST();
        int array [] = {4,2,7,1,3};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
        System.out.println("Enter element to be search");
        int num = scan.nextInt();
        obj.search(root,num);
        System.out.println(obj.list);
    }
}
