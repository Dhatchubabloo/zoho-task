package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    class Node{
        int data;
        Node left,right;
    }
    public Node createNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left=null;
        newNode.right=null;
        return newNode;
    }
    ArrayList list = new ArrayList();
    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);
        }
    }
    Node insert(Node node, Integer data) {
        if (node == null) {
            return createNode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }else {
            System.out.println("Can't insert The node due to Duplication");
            System.exit(0);
        }
        return node;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node root = null;
       RangeSum obj = new RangeSum();
        Integer array [] = {5,13,null,3,1};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            if(array[i]!=null)
            obj.insert(root,array[i]);
        }
        obj.inOrder(root);
        ArrayList<Integer> data = obj.list;
        int sum=0;
        System.out.println(data);
        int low = scan.nextInt();
        int high = scan.nextInt();
      for(int i=0;i< data.size();i++){
          if(data.get(i)>=low&&data.get(i)<=high){
              sum+=data.get(i);
          }
      }
        System.out.println(sum);
    }

}
