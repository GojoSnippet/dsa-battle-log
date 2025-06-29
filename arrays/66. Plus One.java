class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> mylist = new ArrayList<>();
        for(int a : digits){
            mylist.add(a);
        }
        int carry = 1;
        int sum_val;
        for(int i=mylist.size()-1;i >=0 ;--i){
            sum_val = mylist.get(i)  + carry;
            carry =  sum_val / 10;
            mylist.set(i,sum_val % 10);
            if(carry > 0)continue;
            else break;
        }
        if(carry > 0)mylist.add(0,carry);
        int[] new_arr = new int[mylist.size()];
        for(int i=0;i < mylist.size();i++){
            new_arr[i] = mylist.get(i);
        }
        return new_arr;
    }
}
