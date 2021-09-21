package BST;
import java.util.Scanner;

public class InsertingNode {


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
            InsertingNode obj = new InsertingNode();
        System.out.println("Enter size:");
        int num = scan.nextInt();
        int array [] = new int[num];
            root = obj.insert(root,array[0]);
            for(int i=1;i< array.length ;i++){
                obj.insert(root,array[i]);
            }

    }
}
