package BST;

public class CheckBST {

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
    Node insert(Node node, int data) {
        if (node == null) {
            return createNode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            System.out.println("Can't insert The node due to Duplication");
            System.exit(0);
        }
        return node;
    }

    public static void main(String[] args) {
        Node root = null;
        CheckBST obj = new CheckBST();
        int array [] = {12,4};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
      if(obj.isBst(root))
          System.out.println("Same");
      else
          System.out.println("Not Same");
    }

    public boolean isBst(Node root) {
        if(root!=null){
            if(root.left!=null&&root.right!=null){
                if(!(root.left.data<root.data)){
                    return false;
                }
                if(!(root.right.data>root.data)){
                    return false;
                }
                return true;
            }
            else if(root.left!=null){
                isBst(root.left);
                return true;
            }
            else if(root.right!=null){
                isBst(root.right);
                return true;
            }
            else
                return true;

        }
        else
            return true;
    }
}
