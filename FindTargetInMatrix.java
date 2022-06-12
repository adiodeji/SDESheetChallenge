import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        
		int low=0;
        int high=m*n-1;
        int middle=0;
        while(low<=high){
            middle=low+(high-low)/2;
            if(mat.get(middle/n).get(middle%n)==target){
                return true;
            }
            if(mat.get(middle/n).get(middle%n)>target){
                high=middle-1;
            }
            if(mat.get(middle/n).get(middle%n)<target){
                low=middle+1;
            }   
        }
        
        return false;
	}
}
