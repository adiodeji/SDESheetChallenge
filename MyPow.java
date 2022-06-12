class Solution {
   
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n==1)return x;

        double res= myPow(x,n/2);
        if(n%2==0)return res*res;
        else{
            if(n>0)return x*res*res;
            else return res*res/x;
        }
      

        
        /*brute O(n)
        double ans = 1.0;
        int m=Math.abs(n);
        for(int i = 0; i<m; i++){
            ans = ans * x;
        }
        if(n<0)ans=1.0/ans;
        return ans;*/
        
    }

}    
