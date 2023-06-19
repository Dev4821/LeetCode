class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int max2=0;
        for(int i=0;i<gain.length;i++)
        {
            if(max>max2+gain[i])
            {
                max2=max2+gain[i];
            
            }
            else
            {
                max=max2+gain[i];   
                 max2=max2+gain[i];
            }
        }
        return max;
    }
}
