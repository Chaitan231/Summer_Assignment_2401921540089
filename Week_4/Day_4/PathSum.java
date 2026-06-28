
class PathSum{
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
public boolean hasPathSum(TreeNode root, int targetSum) {
        return f(root,0,targetSum); 
    }
    public boolean f(TreeNode node,int sumTillParent,int targetSum){
        if(node==null){
            return false;
        }
        else if(node.right==null&&node.left==null){
            int currentSum=sumTillParent+node.val;
            if(currentSum==targetSum) return true;
            else return false;
        }
        else{
            int currentSum=sumTillParent+node.val;
            boolean result=false;
            if(node.left!=null){
                result=result||f(node.left,currentSum,targetSum);
            }
            if(node.right!=null){
                result=result||f(node.right,currentSum,targetSum);
            }
            return result;
        }
        
    }
}