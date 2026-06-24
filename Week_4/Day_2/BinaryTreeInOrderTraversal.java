package Week_4.Day_2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
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
    private List<Integer> answer;
    public List<Integer> inorderTraversal(TreeNode root) {
        this.answer=new ArrayList<>();
        inOrder(root);
        return this.answer;
    }
    public void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            this.answer.add(node.val);
           
            inOrder(node.right);
            
            

        }
    }
}
