package Tree;

class TreeNode1 {
    int data;
    TreeNode1 left = null, right = null;

    TreeNode1(int data){
        this.data = data;
    }

}
public class LevelOrderTraversal {

    public static boolean printTable(TreeNode1 node, int level){
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

    public static void treeTraversal(TreeNode1 node){
        int level = 1;
        while(printTable(node, level)){
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode1 node = new TreeNode1(10);
        node.left = new TreeNode1(5);
        node.right = new TreeNode1(15);
        node.right.left = new TreeNode1(9);
        node.right.right = new TreeNode1(7);
        node.left.left = new TreeNode1(1);
        node.left.right = new TreeNode1(3);

        treeTraversal(node);
    }
}
