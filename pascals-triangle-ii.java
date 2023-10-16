class Solution {
    public List<Integer> getRow(int rowIndex) {
    int arr[][]=new int[rowIndex+1][rowIndex+1];

       List<Integer> res=new ArrayList<>();
    for(int i=0;i<rowIndex+1;i++)
    {   
        for(int j=0;j<i+1;j++)
        {
            if(j==0||j==i)
            {
                arr[i][j]=1;
            }
            else
            {
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
            if(i==rowIndex)
            {
                res.add(arr[i][j]);
            }
        }
    }
    return res;
    }
}
