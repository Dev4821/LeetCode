class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> list=new ArrayList<Integer>();
        dfs(root,list);
        return list;
        
    }
    private void dfs(TreeNode root,List<Integer> list)
    {
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {TreeNode temp=stack.pop();
            list.add(temp.val);
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
          if(temp.left!=null)
            {
                stack.push(temp.left);
            }
        }
            
    }
}
