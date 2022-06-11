class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
           if(n==0)return;
           if(m==0){
               for(int i=0;i<nums1.length;i++)nums1[i]=nums2[i];
               return;
           }
           m=m-1; n=n-1;
           int i;
           for( i=nums1.length-1; !(m<0||n<0);  ){
               if(nums1[m]>=nums2[n]){
                   nums1[i]=nums1[m--];
                   i--;
               }
               else {
                   nums1[i]=nums2[n--];
                   i--;
                   
               }
           }
        
           if(m<0){
            for(int j=i; j>=0; j--)
               nums1[j]=nums2[n--]; 
               return;
           }
           if(n<0)for(int j=i; j>=0; j--)nums1[j]=nums1[m--]; 
        
    }
          
}
