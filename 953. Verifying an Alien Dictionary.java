class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++)
        {
            map.put(order.charAt(i),i+1);
        }
    
        for(int i=0;i<words.length-1;i++)
        {
            if(compareAlien(words[i],words[i+1],map)>0)
            {
              return false;  
            }
        }
        return true;
     
    }
    protected static int compareAlien(String str1,String str2,  HashMap<Character, Integer> map )
    {
        for (int i = 0; i < str1.length() &&
                    i < str2.length(); i++) {
            if (map.get(str1.charAt(i)) ==
                map.get(str2.charAt(i))) {
                continue;
            }
            else {
                return map.get(str1.charAt(i)) -
                    map.get(str2.charAt(i));
            }
        }
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }
         
        else {
            return 0;
        }
    }
}
