class Solution {
    public boolean isMonotonic(int[] nums) {
       
       if(nums.length==1) return true;
       int flag=0;
       
        for(int i=1;i<nums.length;i++)
        {
           if(flag==0 && nums[i]>nums[i-1])
           {
               flag=1;
           }else if(flag==0 && nums[i]<nums[i-1])
           {
               flag=2;
           }
           else if(flag==1 && nums[i]<nums[i-1])
           {
               return false;
           }
           else if(flag==2 && nums[i]>nums[i-1])
           {
               return false;
           }
         
        }
        return true;
    }
}
