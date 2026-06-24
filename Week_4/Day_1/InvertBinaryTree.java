



public class InvertBinaryTree {
    public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
    public TreeNode invertTree(TreeNode root) {
       if(root!=null){

        TreeNode newLeft=invertTree(root.left);
        TreeNode newRight=invertTree(root.right);
        root.right=newLeft;
        root.left=newRight;
       }
        return root;
    }
}
