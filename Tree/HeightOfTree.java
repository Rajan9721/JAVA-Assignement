package Tree;

class Node{
    int data;
    Node left = null , right = null;

    Node(int data){
        this.data = data;
    }
}
public class HeightOfTree {

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);

        System.out.println("Height of the tree is: "+height(root));
    }
}
