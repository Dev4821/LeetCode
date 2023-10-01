class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s");
        String result="";
         for(int i=0;i<words.length;i++){  
               result=result+rev(words[i]);
             if(i<words.length-1)
             {
                 result=result+" ";
                 
             }
                 }  
        return result;
    }
    private String rev(String s)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
           res=s.charAt(i)+res; 
        }
        return res;
        
    }
}
