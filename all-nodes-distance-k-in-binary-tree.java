/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, List<TreeNode>>graph =new HashMap<>();
        buildGraph(root,null,graph);
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        queue.add(new Pair<>(target, 0));
        visited.add(target);
        while(!queue.isEmpty())
        {
            Pair<TreeNode,Integer> pair=queue.poll();
            TreeNode node =pair.getKey();
            int distance=pair.getValue();
            if(distance == k)
            {
                result.add(node.val);
            }
            if(distance>k)
            {
                break;
            }
            for(TreeNode neighbour:graph.get(node))
            {
                if(!visited.contains(neighbour))
                {
                    visited.add(neighbour);
                     queue.add(new Pair<>(neighbour, distance + 1));
                }

            }
        }
        return result;
    }
    public void buildGraph(TreeNode node, TreeNode parent, Map<TreeNode, List<TreeNode>>graph )
    {
        if(node==null)
        {
            return;
        }
        if(!graph.containsKey(node))
        {
            graph.put(node,new ArrayList<>());
        }
        if(parent!=null)
        {
            graph.get(node).add(parent);
            graph.get(parent).add(node);
        }
        buildGraph(node.left, node, graph);
        buildGraph(node.right, node, graph);
    }
}
