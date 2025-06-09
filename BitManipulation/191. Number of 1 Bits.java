class Solution {
    public int hammingWeight(int n) {
        int count=1;
        while((n & n-1) != 0){
            count++;
            n= (n & n-1);
        }
        return count;
    }
}
