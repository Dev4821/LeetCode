class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        int flag1=0;
        int flag2=0;
        for(int i=0,j=nums.length-1;i<n;i++,j--)
        {
             if(nums[i]==target && flag1==0)
             {
                 arr[0]=i;
                 flag1=1;
             }
             if(nums[j]==target&& flag2==0)
             {
                 arr[1]=j;
                 flag2=1;
             }
        }
        if(flag1==0)
        {
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}
