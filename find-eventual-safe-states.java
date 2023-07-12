class Solution 
{
     public boolean dfs(List<List<Integer>> adj, int src, boolean[] vis, boolean[] recst) {
        vis[src] = true;
        recst[src] = true;
        for (int x : adj.get(src)) {
            if (!vis[x] && dfs(adj, x, vis, recst)) {
                return true;
            } else if (recst[x]) {
                return true;
            }
        }
        recst[src] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) 
    {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++)
            {
                ls.add(graph[i][j]);
            }
            adj.add(ls);
        }
      boolean[] visited =new boolean[n];
      boolean[] recst=new boolean[n];
      for (int i=0;i<n;i++)
      {
          if(!visited[i])
          {
              dfs(adj,i,visited,recst);
          }
      }   
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < recst.length; i++) {
            if (!recst[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
  
}
