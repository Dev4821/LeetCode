
class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum=sum+Math.abs(passengers[i]-chairs[i]);
        }
        return sum;
    }
}
