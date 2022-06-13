import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int[] nums= new int[arr.size()];
        for(int i=0;i<nums.length;i++)nums[i]=arr.get(i);
        int[] temp= new int[nums.length];
        return mergeSort(nums,temp,0,nums.length-1);
    }

    public static int mergeSort(int[] arr,int[] temp,int l, int r){
        int count=0;
        int m;
        if(l<r){
          m=(l+r)/2;
          count=mergeSort(arr,temp,l,m);
          count+=mergeSort(arr,temp,m+1,r);
          count+=merge(arr,temp,l,m,r);
         }
         return count;
    }
    
    public static int merge(int[] arr, int[] temp, int l,int m,int r){
        int i=l, j=m+1, k=l, count=0;
        while(i<=m && j<=r){   
            if(arr[i]<= (long)  2*arr[j])i++;
            else{
                j++;
                count+=m-i+1;
            }
        }
        
         i=l;j=m+1;k=l;       
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
               temp[k++]=arr[j++];
            }
        }
        
        while(i<=m)temp[k++]=arr[i++];
        while(j<=r)temp[k++]=arr[j++];
        
        for(int a=l; a<=r; a++)arr[a]=temp[a];
        return count;
    }
}

