class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int n=matrix.length;
        
        //transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //relect
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        
    }
}
