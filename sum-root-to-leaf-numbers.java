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
   private static int sum1;
     
    static int change;
    public int sumNumbers(TreeNode root) {
        sum1=0;
        change=0;
        helper(root);
        return sum1 ;
    }
    public static void helper(TreeNode root)
    {
     if(root==null)
     {
      
       return ;
     }
     else
     {
         change=change*10+root.val;
        
     }
     helper(root.left);
   
     helper(root.right);
     if(root.left==null && root.right==null)
     {
         System.out.println(sum1);
     sum1=change+sum1;
     
     System.out.println(change+" "+sum1);
     }
     change=change/10;
     
     
     return;

    }
}
