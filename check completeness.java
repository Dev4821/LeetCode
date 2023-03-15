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
    public boolean isCompleteTree(TreeNode root) {
        List<Integer> lis=new ArrayList<>();
        helper(root,lis);
        int flag=0;
     for(int i=0;i<lis.size();i++)
     {
      if(lis.get(i)==-1 && flag==0 )
      {
          flag=1;
      }
      if(lis.get(i)!=-1 && flag==1)
      {
          return false;
      }
     }
        return true;
    }
    public void helper(TreeNode root,List<Integer> lis)
    {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        lis.add(root.val);
        while (!queue.isEmpty()) {
 
            
            TreeNode tempNode = queue.poll();
            
 
          
            if (tempNode.left != null) {
                queue.add(tempNode.left);
                 lis.add(tempNode.left.val);
            }
            else
            {
            lis.add(-1);
            }
 
            
            if (tempNode.right != null) {
                queue.add(tempNode.right);
                 lis.add(tempNode.right.val);
            }
            else
            {
                lis.add(-1);
            }
        }
    }
}
