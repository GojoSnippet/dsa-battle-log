O(nlogn)

class Solution {
    public int no_of_bits(int n){
        int count=1;
        while((n & n-1) != 0){
            count++;
            n = (n & n-1);
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        if(n==0)return arr;
        arr[0]=0;
        for(int i=1;i<n+1;++i){
            arr[i]=no_of_bits(i);
        }
        return arr;
    }
}


O(n):
class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        int offset=1;
        for(int i=1;i<n+1;++i){
            if(i == 2*offset)offset = i;
            dp[i] = 1 + dp[i-offset];
        }
        return dp;
    }
}
