class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> result=new ArrayList<Integer>();
        int c=0;
        int sep=k;
        int ans=0;
        for(int i=num.length-1;i>=0;i--)
        {
            ans=num[i]+c+sep%10;
            
        result.add(0,ans%10);
        c=ans/10;
        sep=sep/10;
        }
        if(sep!=0)
        {
            while(sep>0)
            {
                ans=(sep%10)+c;
                  result.add(0,ans%10);
                  c=ans/10;
        sep=sep/10;
            }
        }
        if(c!=0)
        {
           result.add(0,c); 
        }
       return result;
    }
}
