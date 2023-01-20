class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
      Set<List<Integer>> results = new HashSet<>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        
        this.backtrack(comb,0,nums,results);
        
        return new ArrayList<> (results);
    }
    protected void backtrack(LinkedList<Integer> comb,int start,int[] nums,Set<List<Integer>> results)
    {
      
        if(start>=nums.length )
        {
            if(comb.size()>1)
            {
                results.add(new ArrayList<>(comb));
            }
            return;
        }
        if(comb.isEmpty() || comb.get(comb.size()-1)<=nums[start])
        {
            comb.add(nums[start]);
            backtrack(comb,start+1,nums,results);
            comb.removeLast();
        }
     backtrack(comb,start+1,nums,results);
    }
}
