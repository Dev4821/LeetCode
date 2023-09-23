class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2)-> Integer.compare(s1.length(),s2.length()));
      HashMap <String,Integer> map=new HashMap<String,Integer> ();
      int n=words.length;
     int ans=0;
     for(String word:words)
     {
         int longest=0;
         for(int i=0;i<word.length();i++)
         {
             StringBuilder sb=new StringBuilder(word);
             sb.deleteCharAt(i);
             String sub=sb.toString();
             longest=Math.max(longest,map.getOrDefault(sub,0)+1);
            
         }
         map.put(word,longest);
         ans=Math.max(ans,longest);

     }
     return ans;
    }
}
