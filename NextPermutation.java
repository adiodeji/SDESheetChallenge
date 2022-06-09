import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
        
    int[] nums=new int[permutation.size()];
    for (int i = 0; i < permutation.size(); i++)
            nums[i] = permutation.get(i);
 
        
      int len=nums.length; 
      int i;
        
      for( i=len-2; i>=0&&nums[i+1]<=nums[i];i--);
        
        
      if(i>=0){
        int j=nums.length-1;
        while(nums[j]<=nums[i])j--;
        swap(nums,i,j);
            
      }    
        
 
        for(int l=i+1,j=len-1;l<j;l++,j--){
            swap(nums,l,j);
            
        }
        
         for (int l = 0; l < nums.length; l++)
            permutation.set(l,nums[l]);
        
        return permutation;
        
    }
    
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
