package Tree;

class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;
    TreeNode4()
    {}
    TreeNode4(int val) {
        this.val = val;
    }
    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }

class ValidBST {

    public boolean check(TreeNode4 root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >=max){
            return false;
        }

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode4 root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
