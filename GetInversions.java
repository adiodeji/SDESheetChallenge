import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long[] temp= new long[n];
        return mergeSort(arr,temp,0,n-1);
    }
    
    
    public static long mergeSort(long[] arr,long[] temp,int l, int r){
        long count=0;
        int m;
        if(l<r){
          m=(l+r)/2;
          count+=mergeSort(arr,temp,l,m);
          count+=mergeSort(arr,temp,m+1,r);
          count+=merge(arr,temp,l,m,r);
         }
         return count;
    }
    
    public static long merge(long[] arr, long[] temp, int l,int m,int r){
        int i=l;
        int j=m+1;
        int k=l;
        long count=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
               count+=m-i+1;
               temp[k++]=arr[j++];
            }
        }
        
        while(i<=m)temp[k++]=arr[i++];
        while(j<=r)temp[k++]=arr[j++];
        
        for(int a=l; a<=r; a++)arr[a]=temp[a];
        return count;
    }
}
