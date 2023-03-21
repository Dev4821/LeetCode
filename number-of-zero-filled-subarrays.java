class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int flag=0;
        long count =0;
        long sb=0;
        for(int i=0;i<nums.length;i++)
        {
         if(flag==0 && nums[i]==0)
         {
             sb++;
             flag=1;
         }
         else if(flag==1 && nums[i]==0)
         {
           sb++;  
         }
         else
         {
             System.out.println(sb);
             count=factorial(sb)+count;
             sb=0;
             flag=0;
         }
         
        }
        if(sb!=0)
        {
           count=factorial(sb)+count; 
        }
        return count;
    }
    public static long factorial(long n)
    {
        long result=0;
        for(long i=n;i>0;i--)
        {
            result=i+result;
        }
        return result;
    }
}
