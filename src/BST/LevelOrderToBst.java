package BST;

public class LevelOrderToBst {
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
    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
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
        LevelOrderToBst obj = new LevelOrderToBst();
        int array [] = {7,4,12,3,6,8,1,5,10};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
        obj.preOrder(root);
    }
}
