package Tree;

import com.sun.source.tree.Tree;

class TreeNode{
    int data;
    TreeNode left = null, right = null;

    TreeNode(int data){
        this.data = data;
    }

}
public class LevelOrderTraversal {

    public static boolean printTable(TreeNode node, int level){
        if(node == null){
            return false;
        }
        else if (level == 1) {
            System.out.println(node.data);
            return true;
        }

        boolean left = printTable(node.left, level-1);
        boolean right = printTable(node.right, level-1);

        return (left || right);
    }

    public static void treeTraversal(TreeNode node){
        int level = 1;
        while(printTable(node, level)){
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(15);
        node.right.left = new TreeNode(9);
        node.right.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);

        treeTraversal(node);
    }
}
