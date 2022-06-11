import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
       int repeated=0,missing=0;
       int[] temp= new int[n];
       for(int ar: arr)temp[ar-1]=temp[ar-1]+1;
       for(int i=0; i<n; i++){
           if(temp[i]>1)repeated=i+1;
           if(temp[i]==0)missing=i+1;
       }
        
       return new int[]{missing,repeated};
    }
}
