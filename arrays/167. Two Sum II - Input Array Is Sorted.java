class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1=0,p2=numbers.length-1;
        int curr_val;
        while(p1 < p2){
            curr_val = target - numbers[p2];
            while(numbers[p1] < curr_val) p1++;
            if(numbers[p1] == curr_val)return new int[]{p1+1,p2+1};
            else{
                p2--;
            }
        }
        return new int[]{0,0};
    }
}
