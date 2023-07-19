public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int no=m*n;
        int l=0,h=no-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(matrix[mid/n][mid%n]>target)
                h=mid-1;
            else if(matrix[mid/n][mid%n]<target)
                l=mid+1;
            else
                return true;
        }
        return false;
    }
}
 d3q1 {
    
}
