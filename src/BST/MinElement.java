package BST;


public class MinElement {
        class Node{
            int data;
            Node left,right;
        }
    int findMin(Node root){
            int min = 0;
        if(root!=null){
            if(root.left!=null){
                while(root.left!=null){
                    min = root.left.data;
                    root = root.left;
                }
                return min;
            }
            else
                return root.data;
        }
        else
            return -1;
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
        MinElement obj = new MinElement();
        System.out.println("Enter size:");
        int array [] = {5,6,7,8,9};
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length ;i++){
            obj.insert(root,array[i]);
        }
            System.out.println(obj.findMin(root));
    }
}
