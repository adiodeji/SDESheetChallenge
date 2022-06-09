import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        
    int profit=0, min=Integer.MAX_VALUE;
    for(int p: prices){
        min=Math.min(min,p);
        profit=Math.max(profit, p-min);
    
    }
        
    return profit;
        
        // Write your code here.
    }
}
