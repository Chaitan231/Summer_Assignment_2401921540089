package Week_4.Day_5;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
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
    private int preorderIndex;
    private Map<Integer,Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex=0;
        inorderMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode buildTree(int[] preorder,int[] inorder,int inorderStart,int inorderEnd){
        if(inorderStart>inorderEnd){
            return null;
        }
        int rootValue=preorder[preorderIndex];
        TreeNode root=new TreeNode(rootValue);
        int rootIndex=inorderMap.get(rootValue);
        preorderIndex++;
        root.left=buildTree(preorder,inorder,inorderStart,rootIndex-1);
        root.right=buildTree(preorder,inorder,rootIndex+1,inorderEnd);
        return root;
    }
}
