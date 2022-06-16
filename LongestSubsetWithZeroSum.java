import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
    int sum=0;int max=0;
        Map<Integer,Integer> m= new HashMap<>();
    for(int i=0; i<arr.size();i++){
        sum+=arr.get(i);
        if(sum==0){
            max=i+1;
            continue;
        }
        if(m.containsKey(sum)){
            max=Math.max(max,(i-m.get(sum)) );
        }else m.put(sum,i);
        
    }
    
    return max;

		// Write your code here.
	}
}
