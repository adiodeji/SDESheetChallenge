import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
      

        int[] nums= new int[n];
        for(int i=0;i<n;i++)nums[i]=arr.get(i);
        
        int slow=nums[0];
        int fast=nums[0];
        
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)break;
        }
        
        int slow2=nums[0];
        while(true){
            if(slow==slow2)break;
            slow=nums[slow];
            slow2=nums[slow2];
            
        }
        
        return slow;
    }
}
