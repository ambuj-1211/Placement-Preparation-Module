public class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m == 1 || n == 1)
        return 1;
        int[][] matrix = new int[m][n];
        for(int i = 0; i<matrix.length-1; i++){
            matrix[i][matrix[0].length-1]=1;
        }
        for(int i = 0; i<matrix[0].length-1; i++){
            matrix[matrix.length-1][i]=1;
        }
        for(int i = m-2;i>=0; i--){
            for(int j = n-2; j>=0; j--){
                matrix[i][j] = matrix[i+1][j]+matrix[i][j+1];
            }
        }
        return matrix[0][0];
    }
} 