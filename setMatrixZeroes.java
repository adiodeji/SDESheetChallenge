import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeroes(int[][] matrix) {
        int row=matrix.length, col=matrix[0].length;
        int col0=1,  row0=1;
        
        for(int i=0; i<row; i++){
            
            if(matrix[i][0]==0)col0=0;
           
            for(int j=1; j<col; j++){
                
                if(i==0 && matrix[i][j]==0){
                    System.out.println(i+"ji "+j);
                    row0=0;
                }
                
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }   
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0||matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        
        if(col0==0){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }
        
        if(row0==0){
            System.out.print("here");
            for(int j=0;j<col;j++){
                matrix[0][j]=0;
            }
        }
        
        
        
    }
}
