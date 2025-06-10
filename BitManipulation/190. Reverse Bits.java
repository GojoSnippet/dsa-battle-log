public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int bit=0;
        int res=0;
        for(int i=0;i<32;++i){
            bit = n & (1 << i);
            if(bit != 0) res = res | (1 << 31-i);
        }
        return res;
    }
}
