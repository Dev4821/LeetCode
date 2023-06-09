class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min='z';
        int count=0;
        for (int i=0;i<letters.length;i++)
        {
            if(target < letters[i] && min>=letters[i])
            {
                min=letters[i];
                count++;
            }

        }
        if(count==0)
        {
            return letters[0];
        }
        return min;
    }
}
