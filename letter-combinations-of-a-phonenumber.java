class Solution {
    static String[] ref = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void backtrack(char str[],char arr[],int curr,int length,LinkedList<String> list){
        if(curr==length){
            list.add(new String(str));
            return;
        }
        String flag = ref[arr[curr]-50];
        for(int i=0;i<flag.length();i++){
            str[curr]=flag.charAt(i);
            backtrack(str,arr,1+curr,length,list);
        }
    }
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();
        if(digits.length()==0) return output;
        char flow[] = new char[digits.length()];
        backtrack(flow,digits.toCharArray(),0,digits.length(),output);
        return output;
    }
}
