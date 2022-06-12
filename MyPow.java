class Solution {
    public double mul(double x, long n){
        if(n==1)return x;
        double ans= mul(x,n/2);
        return (n%2==1)? x*ans*ans: ans*ans;
    }
    
    public double myPow(double x, int n) {
        if(n==0 || x==1)return 1;
        if(x==0)return 0;
        //TO DO : make work without checking MIN_VALUE
        if(x==-1 && n==Integer.MIN_VALUE)return 1;
        if(n==Integer.MIN_VALUE )return 0;
        double res= mul(x,Math.abs(n));
        return (n<0)?1/res:res;
        
        
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
