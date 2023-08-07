class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int r=matrix.length, c=matrix[0].length;
      boolean res=true;
      for(int[] row:matrix){
          res=search(row,target);
          if(res) break;
      } 
      return res;
    }
     public boolean search(int[] row,int target){
      int l=0,r=row.length-1;
      while(l<=r){
          int mid=(l+r)  /2;
            if(row[mid]==target){
                return true;
            }
            else if(row[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
     }
}
