class Solution {
    public int getSum(int a, int b) {
        int temp =  a^ b;
        int carry = (a & b) << 1;
        int temp2 = temp;
        while(carry != 0){
            temp2 = temp ^ carry;
            carry = (temp & carry) << 1;
            temp =temp2;
        }
        return temp2;
    }
}
