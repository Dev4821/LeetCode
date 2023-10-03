class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans=0;
        for (int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            ans+=map.get(num)-1;
        } 
        return ans;
    }
}
