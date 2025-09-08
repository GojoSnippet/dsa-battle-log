class Solution {
    public double pow(double x,long n){
        if(n==0)return 1;
        if(x == 0)return 0;
        if(n % 2 != 0 ){
            return x* pow(x,n-1);
        }
        else{
            return pow(x*x,n/2);
        }
    }
    public double myPow(double x, int n) {
        if(x == 1)return 1;
        if(x==-1)return n%2==0?1:-1;
        if(n<0)x=1/x;
        long nn=Math.abs(n);
        return pow(x,nn);
    }
}
