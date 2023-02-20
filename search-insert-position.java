class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        while(low<=high)
        {
            int med=low+(high-low)/2;
            if(nums[med]==target)
            {
                return med;
            }
            else if(target<nums[med])
            {
                high=med-1;
            }
            else
            {
                low=med+1;
            }
        }
        return high+1;
    }
}
