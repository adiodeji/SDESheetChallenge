import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        
        ArrayList<ArrayList<Long>> triangle = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> prev = new ArrayList<Long>();
        ArrayList<Long> row = null;
        
        triangle.add(new ArrayList<Long>());
        triangle.get(0).add(1L);// Base Case
        
        for(int i = 1; i < n; i++){
             prev=triangle.get(i-1);
             row= new ArrayList<Long>();
             row.add(1L);
             for(int j=1; j<i;j++){
                 row.add(prev.get(j-1)+prev.get(j));
             }
             row.add(1L);
             triangle.add(row);
        }
    
        
        
        return triangle;
        
	}
}
