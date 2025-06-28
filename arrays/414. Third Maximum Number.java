class Solution {
    public int thirdMax(int[] nums) {
        Integer first_max= null;
        Integer second_max= null;
        Integer third_max= null;
        for(int val : nums){
            if(first_max == null || val  > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max= val;
            }
            else if((second_max == null || val > second_max) && val != first_max){
                third_max = second_max;
                second_max = val;
            }
            else if( (third_max == null || val > third_max) && val != first_max && val!= second_max){
                third_max = val;
            }
        }
        if(third_max == null){
            third_max = first_max;
        }
        return (int)third_max;
    }
}
