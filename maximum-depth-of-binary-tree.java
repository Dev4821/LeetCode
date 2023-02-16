/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int height=0;
        int max=0;
      int result= dfs( height, root,max);
       return result;

        
    }
protected static int dfs(int height,TreeNode root ,int max)
{
 if(root==null)
 {
     if(height>max)
     {
         max=height;
     }
     height=0;
     return max;
 }
 else
 {
     height++;
 }
 int left=dfs( height, root.left,max);
 int right=dfs( height, root.right,max);
 if(left>right)
 {
     max=left;
 }
 else
 {
     max=right;
 }
 return max;
}
}
