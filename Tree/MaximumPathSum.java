package Tree;

//  Definition for a binary tree node.
class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;
      TreeNode3() {}
      TreeNode3(int val) { this.val = val; }
      TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class MaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int check(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Math.max(0, check(root.left));
        int right = Math.max(0, check(root.right));

        max = Math.max(max , root.val + left + right);

        return root.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        check(root);
        return max;
    }
}