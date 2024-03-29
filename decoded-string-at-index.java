class Solution {
    public String decodeAtIndex(String s, int k) {
         long decodedLength = 0;
        int i;
        
        // Calculate the length of the decoded string
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                decodedLength *= digit;
            } else {
                decodedLength++;
            }
            
            if (decodedLength >= k) {
                break;
            }
        }
        
        // Backtrack to find the k-th character
        for (int j = i; j >= 0; j--) {
            char ch = s.charAt(j);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                decodedLength /= digit;
                k %= decodedLength;
            } else {
                if (k == 0 || k == decodedLength) {
                    return String.valueOf(ch);
                }
                decodedLength--;
            }
        }
        
        return "";
    }
}
