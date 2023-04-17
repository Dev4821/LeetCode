class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> ls=new ArrayList<Boolean>();
        int check;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
         max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++)
        {
            check=candies[i]+extraCandies;
            if(max<=check)
            {
                ls.add(true);
            }
            else
            {
                ls.add(false);
            }
        }
      return ls;
    }
   
}
