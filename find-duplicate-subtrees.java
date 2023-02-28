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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ls= new ArrayList<TreeNode>();
        HashMap<String,Integer> map=new HashMap<>();
    
        helper(map,ls,root);
        return ls;
    }
     String helper(HashMap<String,Integer> map,List<TreeNode> res,TreeNode root)
    {
       if(root ==null)
       {
           return "";
       }
        String left=helper(map,res,root.left);
        String right=helper(map,res,root.right);
        int currroot=root.val;
        String stringformed=currroot+"$"+left+"$"+right;
        
        if(map.getOrDefault(stringformed,0)==1){
            res.add(root);
        }
        map.put(stringformed,map.getOrDefault(stringformed,0)+1);
        return stringformed;
    }
}
